
public class LogMessage {

	private String machineId;
	private String description;
	
	public LogMessage(String message) {
		//to be implemented in part (a)
		// find the semi colan, part before is id, after is description
		int semi = message.indexOf(":");
		machineId = message.substring(0, semi);
		description = message.substring(semi + 1);
	}
	
	/**
	 * Returns true if the description in this log message properly 
	 * contains keyword; false otherwise
	 */
	public boolean containsWord(String keyword) {
		//to be implemented in part (b)
		return description.contains(" " + keyword + " ");
	}
	
	public String getMachineId() {
		return machineId;
	}
	
	public String getDescription() {
		return description;
	}
}
