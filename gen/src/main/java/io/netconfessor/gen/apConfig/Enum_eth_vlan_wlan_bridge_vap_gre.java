
package io.netconfessor.gen.apConfig;

import io.netconfessor.YangEnumeration;
import io.netconfessor.YangException;

/**
 * 
 * <br/>
 * Namespace: 
 *
 * @author jnc.py
 */
public class Enum_eth_vlan_wlan_bridge_vap_gre extends YangEnumeration {

    private static final long serialVersionUID = 1L;

    public static final String ETH = "eth";

    public static final String VLAN = "vlan";

    public static final String WLAN = "wlan";

    public static final String BRIDGE = "bridge";

    public static final String VAP = "vap";

    public static final String GRE = "gre";

    /**
     * Constructor for Enum_eth_vlan_wlan_bridge_vap_gre object from a string.
     * @param value Value to construct the Enum_eth_vlan_wlan_bridge_vap_gre from.
     */
    public Enum_eth_vlan_wlan_bridge_vap_gre(String value) throws YangException {
        super(value, enums());
        check();
    }

    /**
     * Sets the value using a string value.
     * @param value The value to set.
     */
    public void setValue(String value) throws YangException {
        super.setValue(value);
        check();
    }

    /**
     * Checks all restrictions (if any).
     */
    public void check() throws YangException {
        super.check();
    }

    public static String[] enums() {
        return new String[] {
                ETH,
                VLAN,
                WLAN,
                BRIDGE,
                VAP,
                GRE,
            };
    }

}
