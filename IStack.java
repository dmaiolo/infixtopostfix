package InfixtoPostfixMaiolo;

/**
 * Interface defines a generic stack
 * @author Kevin Flynn
 *
 * @param <T>
 */
public interface IStack<T>
{
	public boolean isEmpty();
	public void push(T item);
	public T pop();
	public T top();
}
