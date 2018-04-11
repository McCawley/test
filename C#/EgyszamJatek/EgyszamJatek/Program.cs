using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using EgyszamJatek.Classes;
using System.IO;

namespace EgyszamJatek {
    class Program {
        static void Main( string[] args ) {
            string[] lines = File.ReadAllLines("egyszamjatek.txt", Encoding.Default);
            List<Guess> guesses = new List<Guess>();
            foreach( string line in lines ) {
                string[] parts = line.Split(' ');
                string last = parts.Last();
                List<int> LineGuesses = new List<int>();
                foreach( string part in parts ) {
                    if( !part.Equals( last ) ) {
                        LineGuesses.Add( int.Parse( part ) );
                    }
                    else {
                        guesses.Add( new Guess( part, LineGuesses ) );
                    }
                }
            }

            // 3. feladat
            Console.WriteLine( "3. feladat: Játékosok száma: {0}", guesses.Count() );

            // 4. feladat
            Console.WriteLine( "4. feladat: Fordulók száma: {0}", (guesses[0].GetGuesses()).Count() );

            // 5. feladat
            bool IsNumberOneGuessed = guesses.Any(x => x.GetGuesses()[0] == 1);
            if( IsNumberOneGuessed ) {
                Console.WriteLine("5. feladat: Az első fordulóban volt egyes tipp!");
            }
            else {
                Console.WriteLine( "5. feladat: Az első fordulóban nem volt egyes tipp!" );
            }

            // 6. feladat
            int max = Int32.MinValue;
            guesses.ForEach( x => {
                if( x.GetGuesses().Max() > max ) max = x.GetGuesses().Max();
            } );
            Console.WriteLine("6. feladat: A legnagyobb tipp a fordulók során: {0}", max);
            Console.ReadLine();
        }
    }
}
