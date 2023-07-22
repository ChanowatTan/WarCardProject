class Player {
    private String name;
    private int score;      //(Add new) score field

    public Player(String name) {
        this.name = name;
        this.score = 0;     //(Add new) Set score from 0
    }

    public String getName() {
        return name;
    }

    public int getScore() {  //(Add new) Set score methods
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}


