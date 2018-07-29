package io.netconfessor;

/**
 * The Tagpath class is used to represent the name of individual schema nodes.
 * Each SchemaNode is identified by a Tagpath.
 */
public class Tagpath {
    public String[] p;

    public Tagpath(int size) {
        p = new String[size];
    }

    public Tagpath(String[] tp) {
        p = tp;
    }

    public Tagpath(String s) {
        final String[] tags = s.split("/");
        p = new String[tags.length];
        System.arraycopy(tags, 0, p, 0, tags.length);
    }

    public Tagpath(Tagpath head, String tailTag) {
        final String[] headTags = head.p;
        final String[] tailTags = tailTag.split("/");

        this.p = new String[headTags.length + tailTags.length];
        System.arraycopy(headTags, 0, this.p, 0, headTags.length);
        System.arraycopy(tailTags, 0, this.p, headTags.length, tailTags.length);
    }

    @Override
    public String toString() {
        String ret = "";
        for (int i = 0; i < p.length; i++) {
            ret += p[i];
            if (i != p.length - 1) {
                ret += "/";
            }
        }
        return ret;
    }

    @Override
    public int hashCode() {
        int h = 0;
        for (int i = 0; i < p.length; i++) {
            h += p[i].hashCode();
        }
        return h;
    }

    @Override
    public boolean equals(Object o) {
        if ((o instanceof Tagpath)) {
            final Tagpath tp = (Tagpath) o;
            if (tp.p.length == p.length) {
                for (int i = 0; i < tp.p.length; i++) {
                    if (!tp.p[i].equals(p[i])) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

}
