import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kraftakt {
    public  ArrayList<String> aktorer = new ArrayList<>();
    HashMap<String, String> hashMap = new HashMap<String, String>();

    public Kraftakt() throws IOException {
        reader();
        secondReader();
    }

    public HashMap<String, String> secondReader() throws IOException {
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\TM61\\git\\src\\Postnummerregister-Excel  (1) .xlsx"));
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);
        String pn = "";
        String kommune = "";
        FormulaEvaluator formulaEvaluator = wb.getCreationHelper().createFormulaEvaluator();
        for(Row row : sheet) {
            for(Cell cell : row) {
                switch (formulaEvaluator.evaluateInCell(cell).getCellType()) {
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue()+ "\t\t");
                        break;
                    case Cell.CELL_TYPE_STRING:
                        //System.out.print(cell.getStringCellValue()+ "\t\t");
                        if (cell.getStringCellValue().equals("Kommunenavn") || cell.getStringCellValue().equals("Postnummer"))
                            break;
                        if (cell.getStringCellValue().matches(".*\\d.*")) {
                            pn = cell.getStringCellValue();
                            break;
                        }
                        kommune = cell.getStringCellValue();
                        if(kommune.contains(" ")){
                            kommune= kommune.substring(0, kommune.indexOf(" "));
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + formulaEvaluator.evaluateInCell(cell).getCellType());
                }
                if (!pn.equals("") && !kommune.equals(""))
                   // postNr.add(pn + "\t" + kommune);
                    hashMap.put(pn, kommune);
            }
        }
        return  hashMap;
    }

    public ArrayList<String> reader() {
        try (Scanner sc = new Scanner(new File("src\\nettleie_og_kommuner.txt"))) {
            while (sc.hasNextLine()) {
                aktorer.add(sc.nextLine().toUpperCase());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("error");
        }
        return aktorer;
    }

    public String findProvider(String str) {
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (str.equals(key)) {
                for (String aktor : aktorer) {
                    if (aktor.toUpperCase().contains((CharSequence) value)) {
                        System.out.println(aktor);
                        break;
                    }
                }
            }
        }
        return aktorer.toString();
    }
}


