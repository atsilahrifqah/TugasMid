/*Nama: Atsilah Rifqah Wardani*/
/*Nim: 13020210060*/
/*Kelas : B1*/

interface A {
    public void aaa();
}

interface B extends A {
    public void aaa();
}

class Central0060 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String[] arg) {
        Central0060 obj = new Central0060();
	  System.out.println("main");
        obj.aaa();
    }
}
