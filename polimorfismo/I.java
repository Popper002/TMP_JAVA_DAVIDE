package polimorfismo;

interface I {  //Vedere sempre come un contratto chi mi implementa deve per forza implementare i metodi che ho io. 
    public void m2();
}

class A { //Padre 
    public void m1() {
        System.out.println("A.m1");
    }
}

class B extends A implements I {
    public void m1() { // 
        System.out.println("B.m1");
    }

    public void m2() {
        System.out.println("B.m2");
    }
}

class C extends B {
    public void m1() {
        System.out.println("C.m1");
        super.m1();
    }

    public void m2(A obj) {
        System.out.println("C.m2");
        obj.m1();
    }
}
class Main {
    public static void main(String[] args) {
        A y = new C();
        y.m1();

    }
    
}