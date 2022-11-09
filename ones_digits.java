// get seperate digits 
// 123 -> 12, 3
// 12 -> 1, 2
// 1 -> 1

System.out.println(123 % 10); // 3 
System.out.println(123 / 10); // 12 

int n = 123;
int ones = n % 10;
int rest = n / 10;
System.out.println(n + " -> " + rest + ", " + ones); // 123 -> 12, 3
