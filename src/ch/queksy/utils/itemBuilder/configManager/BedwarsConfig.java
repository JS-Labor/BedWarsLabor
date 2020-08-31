//Class by Joel Schaller made at 13:35 on 25.08.2020

package ch.queksy.utils.itemBuilder.configManager;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.nio.file.CopyOption;
import java.nio.file.Files;

public class BedwarsConfig extends YamlConfiguration {

    private String inputPath;
    private File inputFile;
    private String outputPath;
    private File outputFile;

    public BedwarsConfig(String inputPath, String outputPath) {
        this.inputPath = inputPath;
        this.outputPath = outputPath;
    }

    public void setup() {
        inputFile = new File(inputPath);
        outputFile = new File(outputPath);
        if (!inputFile.exists()) {
            Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "could't find config with path: " + ChatColor.GOLD + inputPath);
        } else {
            if (!outputFile.exists()) {
                Bukkit.getConsoleSender().sendMessage("crating " + inputPath);
            }
        }
    }
}
