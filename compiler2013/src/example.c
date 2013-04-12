typedef long LL;
int main()
{
  int a;
  int b;

  if (a == b)
	  a = 1;
  for (i = 0; i < 100; ++i)
	  b = a;
  a = 0;
  b = 10;

  {
    int b;
    b = 20;
    a = a + b;
  }

  return a;
}
