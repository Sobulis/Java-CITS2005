package Projects;

public class ReactionSimulator {
    public static Element runReactions(Element start, Element[] sequence) {
        Element current = start;
        for (int i = 0; i < sequence.length; i++) {
            System.out.println("Reacting " + current + " with " + sequence[i]);
            current = current.react(sequence[i]);
        }
        return current;
    }

    public static void main(String[] args) {
        Element[] sequence = {
                new Mist(),
                new Tide(),
                new Flare(),
                new Blaze()
        };

        Element start = new Flare();
        Element result = runReactions(start, sequence);
        System.out.println(result);
    }
}

abstract class Element {
    public abstract Element react(Element other);
}

// Families
abstract class Ignis extends Element { }
abstract class Aqua extends Element { }

// Concrete elements
class Flare extends Ignis {
    @Override
    public Element react(Element other) {
        if (other instanceof Ignis){
            return new Blaze();
        }
        return new Mist();
    }

    @Override
    public String toString() {
        return "Flare";
    }
}

class Blaze extends Ignis {
    @Override
    public Element react(Element other) {
        if (other instanceof Aqua){
            return new Tide();
        }
        return new Flare();
    }

    @Override
    public String toString() {
        return "Blaze";
    }
}

class Mist extends Aqua {
    @Override
    public Element react(Element other) {
        if (other instanceof Flare){
            return new Mist();
        }
        return new Blaze();
    }

    @Override
    public String toString() {
        return "Mist";
    }
}

class Tide extends Aqua {
    @Override
    public Element react(Element other) {
        if (other instanceof Aqua){
            return new Mist();
        }
        return new Flare();
    }

    @Override
    public String toString() {
        return "Tide";
    }
}
