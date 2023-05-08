public class primitive{
    public static void main(String[] args) {
        
System.out.printf("--------------------------------%n");
System.out.printf(" Java's Primitive Types         %n");
System.out.printf(" (printf table example)         %n");

System.out.printf("--------------------------------%n");
System.out.printf("| %-10s | %-8s | %4s |%n", "CATEGORY", "NAME", "BITS");
System.out.printf("--------------------------------%n");

System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "double",  64);
System.out.printf("| %-10s | %-8s | %04d |%n", "Floating", "float",   32);
System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "long",    64);
System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "int",     32);
System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "char",    16);
System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "short",   16);
System.out.printf("| %-10s | %-8s | %04d |%n", "Integral", "byte",    8);
System.out.printf("| %-10s | %-8s | %04d |%n", "Boolean",  "boolean", 1);

System.out.printf("--------------------------------%n");
    }
}