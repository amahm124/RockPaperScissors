import java.util.Random;

public class Game {
    private User comp;
    private User player;
    private Random random;

    private RPS compChoice;


    public Game(User user) {
        this.player = user;
        player = new User();
        comp = new User();
    }

    public void playerChoose(RPS option) {
        player.setChoose(option);
        System.out.println("Rock paper scissors" + player.getName());

    }

    public void userChoice(RPS choose) {
        player.setChoose(choose);
    }

    public void compChoose() {
        Random random = new Random();
        int randomNum = random.nextInt(2);
        compChoice = RPS.values()[randomNum];
    }
    public void setRandom(Random random) {
        this.random = random;
    }

    public String outCome(RPS userChoose, RPS compChoose) {

        if (userChoose == RPS.PAPER && compChoose == RPS.ROCK) {
            return "Youve won";
        } else if (userChoose == RPS.PAPER && compChoose == RPS.SCISSORS) {
            return "You ve lost oh no try again";
        } else if (userChoose == RPS.ROCK && compChoose == RPS.SCISSORS) {
            return "You ve won";
        } else if (userChoose == RPS.SCISSORS && compChoose == RPS.SCISSORS) {
            return "its a draw";
        }
        return "You ve won";
    }

    public RPS getCompChoice() {
        return compChoice;
    }
}
