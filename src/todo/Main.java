package todo;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		ToDoList toDoList = new ToDoList();
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		
		while(!exit)
		{
			System.out.println("\n1. Add Task");
			System.out.println("2 Remove Task");
			System.out.println("3. Mark Task as completed");
			System.out.println("4. Display Task");
			System.out.println("5. Exit");
			System.out.println("Choose an option: ");
		
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice)
			{
				case 1:
				{
					System.out.print("Enter the task description: ");
					String description = scanner.nextLine();
					
					System.out.print("Enter the due date: ");
					String due_date = scanner.nextLine();
					
					toDoList.addTask(description, due_date);
					break;
				}
				
				case 2:
				{
					System.out.print("Enter task number to remove the task: ");
					int removeIndex = scanner.nextInt();
					
					toDoList.removeTasks(removeIndex - 1);
					break;
				}
				
				case 3:
				{
					System.out.print("Enter task number to set it as complete");
					int completeIndex = scanner.nextInt();
					
					toDoList.markTaskCompleted(completeIndex - 1);
					break;
				}
				
				case 4:
				{
					toDoList.displayTasks();
					break;
				}
				
				case 5:
				{
					exit = true;
					break;
				}
				
				default:
				{
					System.out.println("Invalid option. Please choos a valid option");
				}
			}
		}
		scanner.close();
	}
}
