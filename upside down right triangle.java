class Main {
   //Approach 1:
    public static void main(String[] args) {
        for(int i=0;i<=10; i++) {
            for (int j=i; j<=10; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

// Approach 2:


class Main {
    public static void main(String[] args) {
        for(int i=10;i>=0; i--) {
            for (int j=0; j<=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
