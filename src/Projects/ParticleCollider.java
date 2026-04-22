package Projects;

public class ParticleCollider {
    public static Particle runCollisions(Particle start, Particle[] collisions) {
        Particle current = start;
        for (int i = 0; i < collisions.length; i++) {
            System.out.println("Colliding " + current + " with " + collisions[i]);
            current = current.collide(collisions[i]);
        }
        return current;
    }

    public static void main(String[] args) {
        Particle[] collisions = {new ParticleC(), new ParticleD(), new ParticleA(), new ParticleB()};
        Particle start = new ParticleA();
        Particle result = runCollisions(start, collisions);
        System.out.println(result);
    }
}
abstract class Particle {
    public abstract Particle collide(Particle other);
}

abstract class Xapper extends Particle{}
abstract class Zipper extends Particle{}
class ParticleA extends Xapper{
    @Override
    public Particle collide(Particle other) {
        if (other instanceof Xapper){
            return new ParticleA();
        }
        return new ParticleB();
    }
    @Override
    public String toString(){
        return "A";
    }
}
class ParticleB extends Xapper{
    @Override
    public Particle collide(Particle other) {
        if (other instanceof Zipper){
            return new ParticleC();
        }
        return new ParticleA();
    }
    @Override
    public String toString(){
        return "B";
    }
}
class ParticleC extends Zipper{
    @Override
    public Particle collide(Particle other) {
        if (other instanceof ParticleA){
            return new ParticleC();
        }
        return new ParticleD();
    }
    @Override
    public String toString(){
        return "C";
    }
}
class ParticleD extends Zipper{
    @Override
    public Particle collide(Particle other) {
        if (other instanceof Zipper){
            return new ParticleC();
        }
        return new ParticleA();
    }
    @Override
    public String toString(){
        return "D";
    }
}
