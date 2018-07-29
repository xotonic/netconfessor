import io.netconfessor.YangElement;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.junit.Assert.assertEquals;

@Ignore
public class PythonJavaIdentityTest {

    @Test public void normalizeIdentity() throws Exception {


        final String[] strings = {
                "MemTotal",
                "MemFree",
                "Buffers",
                "Cached",
                "SwapCached",
                "Active",
                "Active_anon_",
                "Active_file_",
                "Inactive",
                "Inactive_anon_",
                "Inactive_file_",
                "Unevictable",
                "Mlocked",
                "HighTotal",
                "HighFree",
                "LowTotal",
                "LowFree",
                "SwapTotal",
                "SwapFree",
                "Dirty",
                "Writeback",
                "AnonPages",
                "Mapped",
                "Shmem",
                "Slab",
                "SReclaimable",
                "SUnreclaim",
                "KernelStack",
                "PageTables",
                "NFS_Unstable",
                "Bounce",
                "WritebackTmp",
                "CommitLimit",
                "Committed_AS",
                "VmallocTotal",
                "VmallocUsed",
                "VmallocChunk",
                "HardwareCorrupted",
                "HugePages_Total",
                "HugePages_Free",
                "HugePages_Rsvd",
                "HugePages_Surp",
                "Hugepagesize",
                "DirectMap4k",
                "DirectMap2M",
                "DirectMap4M",
        };

        for (String s : strings) {
            assertEquals(pythonScriptNormalize(s), YangElement.normalize(s));
        }
    }

    public static String pythonScriptNormalize(String input) throws Exception {

        Process p = Runtime.getRuntime()
                .exec(new String[] {"python", "-c", pythonCallFunctionFromJNCModule("normalize", input)});

        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
        BufferedReader stdErr = new BufferedReader(new InputStreamReader(p.getErrorStream()));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = stdInput.readLine()) != null) {
            sb.append(s);
        }
        while ((s = stdErr.readLine()) != null) {
            sb.append(s);
        }
        return sb.toString();
    }

    private static String pythonCallFunctionFromJNCModule(String function, String input) {
        return String.format("from tools.jnc import %s; print(%s('%s'))", function, function, input);
    }


    public static class A {
        public static void say() {
            System.out.println("A");
        }
    }

    public static class B extends A {
        public static void say() {
            System.out.println("B");
        }
    }


}
