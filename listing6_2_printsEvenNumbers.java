int index = 0;                         //#A
int[] evenNumbers = new int[50];       //#B
for(int i = 0; i < 100; i++)           //#C
   {  if(i % 2 == 0) {                 //#D
         evenNumbers[index] = i;       //#E
         index++;                      //#F
      }
   } 