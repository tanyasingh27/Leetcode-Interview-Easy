/*
Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

Example:

n = 15,

Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]
*/

class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> ls = new ArrayList<String>(n);
        String result;
        for(int i=1; i<=n; i++){
            result = String.valueOf(i);
            if(i%3 == 0 && i%5 == 0)
                result = "FizzBuzz";
            else if(i%3 == 0)
                 result = "Fizz";
            else if(i%5 == 0)
                 result = "Buzz";
            ls.add(result);
        }
        return ls;
    }
}