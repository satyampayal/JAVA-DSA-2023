
class hpf {
  public static void main(String[] args) {
    int n = 81034;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      while (n % i == 0 && n != i)
        n = n / i;

    }
    System.out.println(" Highest prime factor is " + n);
    // now make with simple logic
    System.out.println();
    System.out.println();
    System.out.println();

    n = 4210;
    int c = 2;
    while (c <= n) {
      if (n % c == 0)
        n /= c;
      else
        c += 1;
    }
    if (c == 2)
      System.out.println(n);
    else
      System.out.println(c);
  }

}