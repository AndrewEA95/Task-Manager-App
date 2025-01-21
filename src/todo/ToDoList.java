package todo;

import java.util.ArrayList;
import java.util.List;

public class ToDoList 
{
	private List<Task> tasks;
	
	public ToDoList()
	{
		tasks = new ArrayList<>();
	}
	
	public void addTask(String description, String due)
	{
		tasks.add(new Task(description, due));
	}
	
	public void removeTasks(int index)
	{
		if(index >= 0 && index < tasks.size())
		{
			tasks.remove(index);
		}
	}
	
	public void markTaskCompleted(int index)
	{
		if(index >= 0 && index < tasks.size())
		{
			tasks.get(index).setCompleted(true);
		}
	}
	
	public void displayTasks()
	{
		for(int i = 0; i < tasks.size(); i++)
		{
			System.out.println((i + 1) + ". " + tasks.get(i));
		}
	}
}
