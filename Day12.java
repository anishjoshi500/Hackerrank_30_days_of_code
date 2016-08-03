class Student extends Person{
	private int[] testScores;
    Scanner sc=new Scanner(System.in);
    public Student(String firstName, String lastName, int idNumber, int[] testScores)
        {
        super(firstName, lastName, idNumber);
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.testScores = testScores;
        }
        public char calculate()
        {
       int sum = 0;
       for (int t : testScores)
       sum += t;
       double average = 1.0d * sum / testScores.length;
       if(average < 40)
           {
           return 'T';
       }
       else if((40 <= average) && (average < 55))
           {
           return 'D';
       }
       else if ((55 <= average) && (average < 70))
           {
           return 'P';
       }
       else if ((70 <= average) && (average < 80))
           {
           return 'A';
       }
       else if ((80 <= average) && (average < 90))
           {
           return 'E';
       }
       else if ((90 <= average) && (average <= 100))
           {
           return 'O';
       }
       else
       {
       return 0;
       }

   }
    }
