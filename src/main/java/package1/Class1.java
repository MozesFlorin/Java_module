package package1;

import package2.Class3;

public class Class1 {

    protected  String proVar = "Protected variable"; //3. Protected Access Modifier 1
    public static void main(String[] args) {        // Accessible in a different package, to a different class only if it is a subclass of this one

        Class3 C3 = new Class3();
        ///System.out.println(C3.defVar); // "defVariable" is not visible because default is accessible only inside the package
        System.out.println(C3.pubVar);  // "pubVariable" is visible even if it is in package2, since it is public

        Class2 C2 = new Class2();
        System.out.println();


    }
}
