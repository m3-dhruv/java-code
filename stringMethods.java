public class stringMethods {

    public static void main(String[] args) {
        String name = "Thor";
        System.out.println(name);

        // Length
        int len = name.length();
        System.out.println(len);

        // Uppercase
        String uppr = name.toUpperCase();
        System.out.println(uppr);

        // Lowercase
        String low = name.toLowerCase();
        System.out.println(low);
 
        // Trim 
        String nontrim = "    space    ";
        String trm = nontrim.trim();
        System.out.println(nontrim);;
        System.out.println(trm);

        // Substring
        String substr = name.substring(1);
        System.out.println(substr);

        String subst = name.substring(2, 4);
        System.out.println(subst);

        // Replace
        String rep = name.replace('T', 'M');
        System.out.println(rep);

        String rpc = name.replace("or", "anos");
        System.out.println(rpc);

        // start with
        boolean start = name.startsWith("Th");
        System.out.println(start);
        boolean startF = name.startsWith("or");
        System.out.println(startF);

        // End with
        boolean end = name.endsWith("Th");
        System.out.println(end);
        boolean endF = name.endsWith("or");
        System.out.println(endF);

        // Char At
        char chAt = name.charAt(2);
        System.out.println(chAt);

        // Index of
        int indOf = name.indexOf("o");
        System.out.println(indOf);

        // Equal
        boolean equal = name.equals("Thor");
        System.out.println(equal);
        boolean egcase = name.equalsIgnoreCase("thoR");
        System.out.println(egcase);

    }
}