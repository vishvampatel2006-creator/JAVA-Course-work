public class lab1
{
  public static void
main(String[] args) { int a =
Integer.parseInt(args[0]); char op =
args[1].charAt(0); int b =
Integer.parseInt(args[2]); if (op ==
'+')
System.out.println("Answer = " + (a + b));
else if (op == '-')
System.out.println("Answer = " + (a - b));
else if (op == '*')
System.out.println("Answer = " + (a * b));
else if (op == '/')
System.out.println("Answer = " + (a / b));
else
System.out.println("Invalid Operator");
}
}
