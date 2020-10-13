package labA.main;

import java.io.PrintStream;

public class NestedClassExample {
	public class TextFile {
		private String name;
		private String contents;
		private FileSystem fs;
		private PrintStream log;

		public TextFile() {
			this.fs = new FileSystem();
			this.log = System.out;
		}

		public TextFile(String name) {
			this();
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public String getContents() {
			return contents;
		}
		
		public void setName(String name) {
			this.name = name;
		}

		public void setContents(String contents) {
			this.contents = contents;
		}

		public void open() {
			fs.load();
		}
		
		public void close() {
			fs.save();
		}
		
		
		private class FileSystem {
			void save() {
				log.print("Saving file...");
				/*
				 * 
				 * Save file stuff here...
				 *
				 * We're going to fake it
				 * 
				 */
				contents = "";
				log.println("done");
			}
			
			void load() {
				log.print("Loading file...");
				/*
				 * 
				 * Load file stuff here...
				 *
				 * We're going to fake it
				 * 
				 */
				switch(name) {
				case "README.md":
					contents = "# Header";
					break;
				case "README.txt":
					contents = "Header";
					break;
				case "pjmasks.txt":
					contents = "Cos bedtime Is the right time To fight crime";
					break;
				}
				log.println("done");				
			}
		}
	}
}
