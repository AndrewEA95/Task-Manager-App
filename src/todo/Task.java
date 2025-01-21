package todo;

public class Task 
{
	private String description;
	private String due;
	private boolean isCompleted;
	
	public Task(String description, String due)
	{
		this.description = description;
		this.due = due;
		this.isCompleted = false;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getdue()
	{
		return due;
	}
	
	public void setDueDate(String due)
	{
		this.due = due;
	}
	
	public boolean isComplete()
	{
		return isCompleted;
	}
	
	public void setCompleted(boolean completed)
	{
		isCompleted = completed;
	}
	
	@Override
	public String toString()
	{
		return description + "(Due date: " + due + ") " + " (completed: " + isCompleted + ")";
	}
}

