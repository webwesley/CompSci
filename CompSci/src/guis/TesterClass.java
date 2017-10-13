package guis;


public class TesterClass {

	public static void main(String[] args) {
		
		ChoseYourOwnAdventure ten = new ChoseYourOwnAdventure("Congragulations! Mr. Howard decided that you really are a good students, and that + "
				+ "given the circumstances of the situation, deserve one point back. You manage to get into college. Did you make it? As Ghandie once said: 'Yes'", "Actually write a *thought provoking and meaningful essay for once \n *As deemed by the council of Hieberts");
		
		ChoseYourOwnAdventure eleven = new ChoseYourOwnAdventure("Unfortunatly, You were not charasmatic enough. Mr. Howard " +
				"saw through your act and decided that he had enough of your shinanigans. You failed compsci because of that one point. You don't get into college, and end up dying on the street, being consumed by feral badgers", "School is for nerds. Whateves");
		
		
		ChoseYourOwnAdventure nine = new ChoseYourOwnAdventure("Mr. Howard gave you one more chance. This essay was make or break. This one point could change your life. What do you do?", "Try one more time to get this point", ten, eleven);
		
		
		ChoseYourOwnAdventure eight = new ChoseYourOwnAdventure("You decide to study the scripture handed to you by Mr. James Howard. You suspect that this might be some communist propagand, but you take a look anyways. 'First, there was nothing. Then God took six days and six nights to create Mr. James Howard. On the seventh, he created everything of lesser importance.' You read another section. 'The history of all hitherto existing society is the history of class struggles.\n" + 
				 "Freeman and slave, patrician and plebeian, lord and serf, guildmaster and journeyman, in a word, oppressor and oppressed, stood in constant opposition to one another, carried on an uninterrupted, now hidden, now open fight, that each time ended, either in the revolutionary reconstitution of society at large, or in the common ruin of the contending classes.' What do you do?", "You take the book and open it up, revealing the truth within", nine, eleven);
		ChoseYourOwnAdventure seven = new ChoseYourOwnAdventure("The teachings of this prophetic leader are almost as good as, like, the second star wars movie. You take another crack at the essay, but Mr. Howard is not ammused. Mr Howard hands you a little red book, and mentions how this could improve your grade. You fear this could be communism, but it could also lead to the eternal truth. What do you do?","Do some more studying", eight, eleven);
		
		ChoseYourOwnAdventure filler = new ChoseYourOwnAdventure(" ", " ");
		
		ChoseYourOwnAdventure two = new ChoseYourOwnAdventure("You decide that compsci is the right fit for you. On one assignment though, Mr. J. T. Howard merciless removed a point with little or no explination, and when you offered to stay for a single day after school to argue and explain why you should not lose a point, he makes no attempt to respond. You decide to write an essay to argue why you should recive the point back. You write your essay and he hates it. He recommends studing the teachings of Mahātmā Mohandas Karamchand Gandhi", "Take CompSci", seven, filler);
		ChoseYourOwnAdventure six = new ChoseYourOwnAdventure("You decide that no other subject holds more intrest then that of gender studies. You commit your self to achiveing everything you can into the riviting studie of the 2 confirmed genders. You write an essay, and for some stragne reason that could only be explained as covering a plot hole, Mr. Howard reads the essay to determin you final grad. He hates it, as it denies the existance of the many robotic genders. What do you do?", "Find a new subject to persue", two, eleven);
		ChoseYourOwnAdventure five = new ChoseYourOwnAdventure("You decide that reading is something that might be useful, so you become an author. You are blinded by ink, however, and due to your terrible memory, forget what words look like", "Find something else", six, two);
		ChoseYourOwnAdventure four = new ChoseYourOwnAdventure("You think that art is pretty cool to look at. So why not try your hand. Turns out, your hands are a bit more like feet than actual hands, with sasuages for toes.", "Find something else", five, two);
		ChoseYourOwnAdventure three = new ChoseYourOwnAdventure("You think computers are kind of weird. So you don't want to do compsci. However, you are told by the counsler that you need one more class to pass high school and beocme an actuall person. What do you do?", "Don't take compsci", two, four);
		ChoseYourOwnAdventure start = new ChoseYourOwnAdventure("You are a prospective student, looking to make your mark on the world. You are *good looking, **witty, and ***beloved by your peers. You have the choice to take one more class. What do you do? *As Deemed by the Council of Heibers. **Arguably your best quality, ***debatable", "", two, three);
		
						
						// "Mr Howard hands you a little red book, and mentions how this could improve your grade. You fear this could be communism, but it could also lead to ", 
		
				start.draw();
	}

}
