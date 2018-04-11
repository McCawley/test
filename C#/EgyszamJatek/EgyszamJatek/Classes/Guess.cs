using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EgyszamJatek.Classes {
    class Guess {
        private string name;
        private List<int> guesses;

        public Guess(string name, List<int> guesses ) {
            this.name = name;
            this.guesses = guesses;
        }

        public void setName(string name ) {
            this.name = name;
        }

        public string GetName() {
            return this.name;
        }

        public List<int> GetGuesses() {
            return this.guesses;
        }
    }
}
