class Main {
  public static void main(String[] args) {
    int age= 16;
    int ageAfterBirthday= age+1;
    int myBirthday= 422;
    int todaysDate= 921;
    //Inserted variable for age, my birthday, and todays date.
    if (myBirthday == todaysDate)
    {
      System.out.println ("If my birthday is " + myBirthday + " and todays date is " + todaysDate + " I am " + ageAfterBirthday + " years old.");
      //Wrote line of code that tells age if birthday is today.
    }else{
      System.out.println ("Since my birthday is " + myBirthday + " and today is " + todaysDate + " I am still " + age + " years old.");
    }
  }
}