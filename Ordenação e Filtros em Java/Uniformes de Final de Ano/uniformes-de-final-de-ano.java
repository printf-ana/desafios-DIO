import java.io.IOException;
import java.util.*;

public class YearEndUniform 
{  
  private String name;
  private String uniformSize;
  private String uniformColor;

  public String getUniformColor() 
  {  
    return this.uniformColor;  
  }

  public void setUniformColor(String uniformColor) 
  {  
    this.uniformColor = uniformColor;
  }

  public String getName() 
  {  
    return this.name;
  }

  public void setName(String name) 
  {
    this.name = name;
  }

  public String getUniformSize() 
  {
    return this.uniformSize;
  }

  public void setUniformSize(String uniformSize) 
  {
    this.uniformSize = uniformSize;
  }

  public YearEndUniform(String name, String uniformColor, String uniformSize) 
  {
    this.name = name;
    this.uniformColor = uniformColor;
    this.uniformSize = uniformSize;
  }

  public void printStudentInfos() 
  {
      System.out.println(this.uniformColor + " " + uniformSize + " " + name);
  }
  
  public static void main(String[] args) throws IOException 
  {  
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt(); 
    scanner.nextLine();
    ArrayList<YearEndUniform> arrayUniforms= new ArrayList<>(N);
    String name, uniformDetails, uniformColor, uniformSize;

    for(int i = 0; i < N; i++) 
    {  
      name = scanner.nextLine(); 
      uniformDetails = scanner.nextLine();  
      uniformColor = uniformDetails.split(" ")[0];
      uniformSize= uniformDetails.split(" ")[1];
      arrayUniforms.add(new YearEndUniform(name, uniformColor, uniformSize));
    }

    scanner.close();
    Collections.sort(arrayUniforms, new UniformComparator());

    for(var item : arrayUniforms) 
    {  
      item.printStudentInfos(); 
    }
  }

  static class UniformComparator implements Comparator<YearEndUniform> 
  {  
    @Override
    public int compare(YearEndUniform student0, YearEndUniform student1) 
    {  
      int res = student0.uniformColor.compareTo(student1.uniformColor);
    
      if(res == 0) 
      {
        res = student0.uniformSize.compareTo(student1.uniformSize);
        
        if(res == 0) 
        {  
          res = student0.name.compareTo(student1.name);
        } else {
          res = -res;
        }
      }
      return res;
    }
  }
}