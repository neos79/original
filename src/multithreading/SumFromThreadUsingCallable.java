package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author naveen.singh
 *
 * 
 */
public class SumFromThreadUsingCallable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(3);
		CallableFactorialTask t1 = new CallableFactorialTask(5);
		CallableFactorialTask t2 = new CallableFactorialTask(3);
		CallableFactorialTask t3 = new CallableFactorialTask(2);
		System.out.println("Number of active threads from the given thread: " + Thread.activeCount());
		Future<Integer> f1 = service.submit(t1);
		Future<Integer> f2 = service.submit(t2);
		Future<Integer> f3 = service.submit(t3);
		Integer v1 = f1.get();
		Integer v2 = f2.get();
		Integer v3 = f3.get();
		System.out.println(v1+v2+v3);
		service.shutdown();
	}
}

class CallableFactorialTask implements Callable<Integer> {
	int n;

	public CallableFactorialTask(int i) {
		this.n = i;
	}

	@Override
	public Integer call() throws Exception {
		return n * (n + 1) / 2;
	}
}