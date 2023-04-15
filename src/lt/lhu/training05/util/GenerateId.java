package lt.lhu.training05.util;

public final class GenerateId {
		
		private GenerateId() {}
		
		private static int nextId = 1;
		
		public static int nextId() {
			return nextId++;
		}


}
