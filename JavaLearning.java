
// class A{
//      void show1()
//      {
//         System.out.println("In Parent show");
//      }

//      void show()
//      {
//         System.out.println("it is method of parent");
//      }
// }

interface B{
     void show();
}

// class B extends A{

//     void show2()
//     {
//         System.out.println("in child show");
//     }

//     void show()
//     {
//       System.out.println("it is method of child");  
//     }

// }
public class JavaLearning {


  public static void main(String[] args) {


    // A obj = new A()
    // {
    //     public void show()
    //     {
    //         System.out.println("in inner class show");
    //     }
    // };
    
    B obj = ()->{
       System.out.println("show from lamda");

    };
    obj.show();
     
  }
    
}
