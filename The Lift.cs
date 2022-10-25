using System;
using System.Linq;
 
namespace TheLift
{
    class Program
    {
        static void Main(string[] args)
        {
            int tourists = int.Parse(Console.ReadLine());
 
            int[] lift = Console.ReadLine().Split().Select(int.Parse).ToArray();
 
            int capacity = (lift.Length * 4) - lift.Sum();
 
 
            for (int i = 0; i < lift.Length; i++)
            {
                int maxWagonCapacity = 4 - lift[i];
 
                if (maxWagonCapacity > 0 && tourists > 0 && capacity > 0)
                {
                    for (int j = 0; j < maxWagonCapacity; j++)
                    {
                        lift[i]++;
                        tourists--;
                        capacity--;
 
                        if (tourists == 0 || capacity == 0)
                        {
                            break;
                        }
                    }
                }
 
            }
 
            if (tourists == 0 && capacity > 0)
            {
                Console.WriteLine("The lift has empty spots!");
                Console.WriteLine(String.Join(" ", lift));
            }
            else if (tourists > 0 && capacity <= 0)
            {
                Console.WriteLine($"There isn't enough space! {tourists} people in a queue!");
                Console.WriteLine(String.Join(" ", lift));
            }
            else if (tourists <= 0 && capacity == tourists)
            {
                Console.WriteLine(String.Join(" ", lift));
            }
        }
 
    }
 
}