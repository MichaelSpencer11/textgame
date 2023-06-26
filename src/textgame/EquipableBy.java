package textgame;

public class EquipableBy {
	
	private boolean warrior;
	private boolean monk;
	private boolean thief;
	private boolean whiteMage;
	private boolean blackMage;
	private boolean redMage;
	
	public boolean getWarrior() {
		return warrior;
	}
	
	public void setWarrior(boolean b) {
		warrior = b;
	}
	
	public boolean getMonk() {
		return monk;
	}
	
	public void setMonk(boolean b) {
		monk = b;
	}
	
	public boolean getThief() {
		return thief;
	}
	
	public void setThief(boolean b) {
		thief = b;
	}
	
	public boolean getRedMage() {
		return redMage;
	}
	
	public void setRedMage(boolean b) {
		redMage = b;
	}
	
	public boolean getBlackMage() {
		return blackMage;
	}
	
	public void setBlackMage(boolean b) {
		blackMage = b;
	}
	
	public boolean getWhiteMage() {
		return whiteMage;
	}
	
	public void setWhiteMage(boolean b) {
		whiteMage = b;
	}
	
	public void setAll(boolean b) {
		warrior = b;
		thief = b;
		whiteMage = b;
		blackMage = b;
		monk = b;
		redMage = b;
	}
}
