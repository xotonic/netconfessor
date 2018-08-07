import collections


class OrderedSet(collections.MutableSet):
    """A set of unique items that preserves the insertion order.

    Created by: Raymond Hettinger 2009-03-19
    Edited by: Emil Wall 2012-08-03
    Licence: http://opensource.org/licenses/MIT
    Original source: http://code.activestate.com/recipes/576694/

    An ordered set is implemented as a wrapper class for a dictionary
    implementing a doubly linked list. It also has a pointer to the last item
    in the set (self.end) which is used by the add and _iterate methods to add
    items to the end of the list and to know when an iteration has finished,
    respectively.

    """

    def __init__(self, iterable=None):
        """Creates an ordered set.

        iterable -- A mutable iterable, typically a list or a set, containing
                    initial values of the set. If the default value (None) is
                    used, the set is initialized as empty.

        """
        self.ITEM, self.PREV, self.NEXT = list(range(3))
        self.end = end = []
        end += [None, end, end]  # sentinel node for doubly linked list
        self.map = {}  # value --> [value, prev, next]
        if iterable is not None:
            self |= iterable

    def __len__(self):
        """Returns the number of items in this set."""
        return len(self.map)

    def __contains__(self, item):
        """Returns true if item is in this set; false otherwise."""
        return item in self.map

    def add(self, item):
        """Adds an item to the end of this set."""
        if item not in self:
            self.map[item] = [item, self.end[self.PREV], self.end]
            self.end[self.PREV][self.NEXT] = self.map[item]
            self.end[self.PREV] = self.map[item]

    def add_first(self, item):
        """Adds an item to the beginning of this set."""
        if item not in self:
            self.map[item] = [item, self.end, self.end[self.NEXT]]
            self.end[self.NEXT][self.PREV] = self.map[item]
            self.end[self.NEXT] = self.map[item]

    def discard(self, item):
        """Finds and discards an item from this set, amortized O(1) time."""
        if item in self:
            item, prev, after = self.map.pop(item)
            prev[self.NEXT] = after
            after[self.PREV] = prev

    def _iterate(self, iter_index):
        """Internal generator method to iterate through this set.

        iter_index -- If 1, the set is iterated in reverse order. If 2, the set
                      is iterated in order of insertion. Else IndexError.

        """
        curr = self.end[iter_index]
        while curr is not self.end:
            yield curr[self.ITEM]
            curr = curr[iter_index]

    def __iter__(self):
        """Returns a generator object for iterating the set in the same order
        as its items were added.

        """
        return self._iterate(self.NEXT)

    def __reversed__(self):
        """Returns a generator object for iterating the set, beginning with the
        most recently added item and ending with the first/oldest item.

        """
        return self._iterate(self.PREV)

    def pop(self, last=True):
        """Discards the first or last item of this set.

        last -- If True the last item is discarded, otherwise the first.

        """
        if not self:
            raise KeyError('set is empty')
        item = next(reversed(self)) if last else next(iter(self))
        self.discard(item)
        return item

    def as_sorted_list(self):
        """Returns a sorted list with the items in this set"""
        res = [x for x in self]
        res.sort()
        return res

    def __repr__(self):
        """Returns a string representing this set. If empty, the string
        returned is 'OrderedSet()', otherwise if the set contains items a, b
        and c: 'OrderedSet([a, b, c])'

        """
        if not self:
            return '%s()' % (self.__class__.__name__,)
        return '%s(%r)' % (self.__class__.__name__, list(self))

    def __eq__(self, other):
        """Returns True if other is an OrderedSet containing the same items as
        other, in the same order.

        """
        return isinstance(other, OrderedSet) and list(self) == list(other)

    def __del__(self):
        """Destructor, clears self to avoid circular reference which could
        otherwise occur due to the doubly linked list.

        """
        self.clear()