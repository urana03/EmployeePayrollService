package com.bridgelabz.employeepayroll;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class DirectoryMonitor {
 
	public static void main(String args) throws IOException, InterruptedException {
		WatchService watcher = FileSystems.getDefault().newWatchService();
		Path path = Paths.get("C:\\Users\\LENOVO\\Desktop\\Demo");
		path.register(watcher,StandardWatchEventKinds.ENTRY_CREATE,StandardWatchEventKinds.ENTRY_MODIFY,
				              StandardWatchEventKinds.ENTRY_DELETE);
		WatchKey key;
			while((key = watcher.take()) != null) {
				for(WatchEvent<?> event : key.pollEvents()) {
					System.out.println("Event Type: "+event.kind()+"File Affected: "+event.context());
				}
			}
			key.reset();
	}
	
}
	

