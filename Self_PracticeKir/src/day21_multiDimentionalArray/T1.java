package src.day21_multiDimentionalArray;

public class T1 {
    public static void main(String[] args) {
        //1
        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};
        //2. declare an array variable named batch1Groups with the length of three
        String[][]  batch1Groups = {batch1Group1,batch1Group2,batch1Group3 };
        //3. given the following arrays:
        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};
        //4. declare an array variable named batch24Groups with the length of
        //4.1 Assign batch2Group1, batch2Group2, batch2Group1 to each indexes of the variable batch2Groups
        String[][] batch2Groups={batch2Group1,batch2Group2,batch2Group3};

        String[][][] cydeoStudents={batch1Groups,batch2Groups};

        for (String[][] ea2d : cydeoStudents) {
            System.out.println();
            for (String[] ea1d : ea2d) {
                System.out.println();
                for (String ea : ea1d) {
                    System.out.print(ea + " ");
                }
            }
        }








    }
}
/*
1. CydeoStudents Task:
		1. given the following arrays:
		 		String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
		 		String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
		 		String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

		2. declare an array variable named batch1Groups with the length of three
				2.1 Assign batch1Group1, batch1Group2, batch1Group1 to each indexes
				 of the variable batch1Groups

		3. given the following arrays:
				String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
		 		String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
		 		String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

 		4. declare an array variable named batch24Groups with the length of
 				4.1 Assign batch2Group1, batch2Group2, batch2Group1 to each indexes of the variable batch2Groups

		5. declare an array variable named CydeoStudents and assign batch1Groups & batch2Groups to the indexes of CydeoStudents

		6. Print the names of each students

 */