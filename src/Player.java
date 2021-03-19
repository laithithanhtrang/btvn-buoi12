public class Player {
    private String fullName;
    private Position position;
    private int number;
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public Position getPosition() {
        return position;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public Player(int number, String fullName, Position position)  {
        this.fullName = fullName;
        this.position = position;
        this.number = number;
    }
    @Override
    public String toString() {
        return "Name=" + fullName + ", number=" + number + ", position=" + position + "\n";
    }

    
}

