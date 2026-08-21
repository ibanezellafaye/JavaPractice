// public class Array{
//     public static void main(String[] args) {

//         // FINDING THE LARGEST NUMBER USING ARRAY
        
//         // int[] numbers = {34, 12, 56, 7, 89, 23, 4};
//         // int largest = numbers[0];

//         // for (int i = 1; i < numbers.length; i++){

//         //     if (numbers[i] > largest){
//         //         largest = numbers[i];
                
//         //     };

//         // }

//         // System.out.println(largest);

//         // AVERAGE + COUNTING

//         int[] numbers = {10, 25, 30, 15, 40, 5};

//         int sum = 0;
//         int count = 0;

//         for (int i = 0; i < numbers.length; i++ ){
//             sum += numbers[i]; //sum = sum + numbers[i]  starting form 0
//             //count = numbers[i];

//             if (numbers[i] > 20){
//                 count += 1;
//                 //System.out.println(numbers[i] + " is greater than 20 ");
//             }
            

//         }
//         // sum 0 + 10 = 10 
//         // sum 10 + 25 = 35
//         // sum 35 + 30 = 65
//         // sum 65 + 15 = 80
//         // sum 80 + 40 = 120
//         // sum 120 + 5 = 125

//         double average = (double) sum / numbers.length;

//         System.out.println("Sum: " + sum);
//         System.out.println("Average: " + average);
//         System.out.println(count);


//     }
// }

public class Age {
    public static void main(String[] args) {

        // int[] Age = { 10, 13, 18, 50, 61};

        // // Categorize each age
        // // Minor, Adult, Senior 
        // // There are two conditions use if else statement
        // // forloop

        // for (int i = 0; i < Age.length; i++){

        //     if (Age[i] < 18) {
        //         System.out.println(Age[i] + " You are a minor");
                
        //     } else if (Age[i] <= 60) {
        //         System.out.println(Age[i] + " You are an adult");

        //     } else {
        //         System.out.println(Age[i] + " You are a senior");
        //     }
                

        // }


        String[] friends = {"Ella", "Alexis", "Martin", "Shairah"};


        for (int i = 0; i < friends.length; i++){

            if (friends[i] != "Martin") {
                System.out.println(friends[i] + " is your friend");
                
            } else {
                System.out.println(friends[i] + " is not your friend");
            }

        }
    }
}