package Practice_Assesments;

public class B {
    static int count;

  public B(){
      count++;
  }

    public B(int i ){
        count += i;

    }
    public void B(String s){
        count += s.length();
    }
    class Test{
        public static void main(String[] args) {
            new B();

            B a = new B();
           // B a2 = new B("word");
            System.out.println(B.count);
        }
    }
}
