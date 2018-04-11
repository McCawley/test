using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;

namespace Fogado {
    class Program {
        static void Main( string[] args ) {
            string[] lines = File.ReadAllLines("fogado.csv");
            lines = lines.Skip( 1 ).ToArray();

            StreamWriter sw = new StreamWriter("nagyletszam.txt");
            sw.WriteLine( "Nagy létszámúak foglalásai" );

            int SumOfMoreThanThree= 0;
            int SumOfBigBookings = 0;
            foreach( string line in lines ) {
                string[] parts = line.Split(';');
                int guest = int.Parse(parts[0]);
                int room = int.Parse(parts[1]);
                string ArrivalDate = parts[2];
                string LeavingDate = parts[3];
                int NumberOfPeople = int.Parse(parts[4]);

                if( NumberOfPeople >= 4 ) {
                    SumOfMoreThanThree++;
                }
                if( NumberOfPeople >= 5 ) {
                    SumOfBigBookings++;
                    sw.WriteLine( "Vendég: {0}, szoba: {1}, érkezés: {2}, távozás: {3}, fő: {4}", guest, room, ArrivalDate, LeavingDate, NumberOfPeople );
                }
            }

            sw.WriteLine( "Foglalások száma: {0}", SumOfBigBookings );

            sw.Close();

            Console.WriteLine( "1. feladat: {0}-n érkeztek négyen, vagy annál többen.", SumOfMoreThanThree );

            Console.ReadLine();
        }
    }
}
