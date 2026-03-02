/* Interface 
(keyword- implements)

- Interface- 100% abstraction

interface interfacename {
     void methodname(); 
}

*/

interface Student {
    void semester(int value); 
}

class abc implements Student {
    @Override 
    public void semester (int value) {
        System.out.println("The student is currently studying in semester:"+ value);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s=new abc();
        s.semester(4);
    }
}
