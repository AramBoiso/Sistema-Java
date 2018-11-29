import java.util.*;
public class Equipo1{
   public static void main(String[] args){
      //Code Actually.0
      Scanner read = new Scanner(System.in);
      
      int folios[] = new int[70]; //Change to 70
      String plates[] = new String[70];
      String brands[] = new String[70];
      String models[] = new String[70];
      String colors[] = new String[70];
      float fines[] = new float[70];
      
      
      int atm = 0, folio = 0, autoMotor = 0;
      char opc, opc2 = '0';
      boolean exists = false, delete =  false;
      String fol = "", mul = "";
      
      Arrays.fill(folios, -1);
      System.out.println("- Corralon Cd. Guzman -");
   
      do{
         System.out.println("1) Alta");
         System.out.println("2) Consulta Individual");
         System.out.println("3) Consulta General");
         System.out.println("4) Modificacion");
         System.out.println("5) Baja");
         System.out.println("6) Finalizar");
         
         System.out.print("Ingrese una opcion [1-6]: ");
         opc = read.next().charAt(0);
         read.nextLine();
         
         switch(opc){
         
            case '1':
               exists = false;
               fol = "";
               System.out.println();
               System.out.println("ALTA");
               System.out.print("Ingresa el folio: ");
               fol = read.nextLine();
               
               if(fol.length() <= 0){ System.out.println("Numero de folio no valido, ingrese uno nuevo en el rango [1 - 100]"); break; } 
               else
                  if(fol.length() > 9){ System.out.println(); System.out.println("Numero de folio no valido, ingrese uno nuevo en el rango [1 - 100]"); System.out.println();}
                  else
                     for(int i = 0; i < fol.length(); i++)
                        if(fol.charAt(i) == '0' || fol.charAt(i) == '1' || fol.charAt(i) == '2' || fol.charAt(i) == '3' || fol.charAt(i) == '4' || fol.charAt(i) == '5' ||
                           fol.charAt(i) == '6' || fol.charAt(i) == '7' || fol.charAt(i) == '8' || fol.charAt(i) == '9'){
                           exists = true;
                        }
                        else{ System.out.println(); System.out.println("Folio No valido, el folio debe estar en el rango [1 - 100]"); System.out.println(); exists = false; 
                           break; } 
                        
                  if(exists){   
                     folio = Integer.parseInt(fol);                     
                     if(folio < 1 || folio > 100){// tres
                        System.out.println("Numero de folio no valido, ingrese otro en el rango [1 - 100]");
                        System.out.println();
                     }else{
                        if(atm == 70) System.out.println("Memoria Llena :C, porfavor vaya a la opcion 'Baja' y elimine un automotaor para liberar espacio");
                        else
                           if(atm > 0)
                              for(int i = 0; i <= atm; i++){
                                 if(folio == folios[i]){  //El folio ya existe.
                                    System.out.printf("El folio %d ya existe, porfavor ingrese uno diferente \n", folio);
                                    System.out.println();
                                    break;
                                 }  
                                 else if(folios[i] != -1) 
                                    continue; //Validar que ya hay datos exixtentes  
                                 else{ // agregar datos
                                    folios[atm] = folio; 
                                    System.out.print("Placas: "); 
                                    plates[atm] = read.nextLine(); 
                                    System.out.print("Marca: ");  
                                    brands[atm] = read.nextLine();
                                    System.out.print("Modelo: "); 
                                    models[atm] = read.nextLine();
                                    System.out.print("Color: ");  
                                    colors[atm] = read.nextLine();
                                    do{                                  
                                       System.out.print("Costo de la multa: $"); 
                                       mul = read.nextLine();
                                             
                                       if(mul.length() <= 0){ fines[atm] = 0; exists = false;  break; }
                                       else{
                                          for(int j = 0; j < mul.length(); j++)
                                             if(mul.charAt(j) == '0' || mul.charAt(j) == '1' || mul.charAt(j) == '2' || mul.charAt(j) == '3' || mul.charAt(j) == '4' || mul.charAt(j) == '5' ||
                                                     mul.charAt(j) == '6' || mul.charAt(j) == '7' || mul.charAt(j) == '8' || mul.charAt(j) == '9'  || mul.charAt(j) == '.' || mul.charAt(j) == ',' )
                                                exists = true;
                                             else{ System.out.println("Valor de la multa no valida"); exists = false; 
                                                break; } 
                                       }  
                                       if(exists){ fines[atm] = Float.parseFloat(mul); }                       
                                          
                                    }while(exists != true);
                                    System.out.println(); atm++;
                                    System.out.println("Registro agregado con Exito");
                                    break;
                                 }
                              }
                           else{
                           if(fol.length() > 9){ System.out.println(); System.out.println("Numero de folio no valido, ingrese uno nuevo en el rango [1 - 100]"); System.out.println();}
                              else
                                 if(folio > 0 || folio <= 100){ // uno
                                    folios[atm] = folio;
                                    System.out.print("Placas: ");
                                    plates[atm] = read.nextLine();
                                    System.out.print("Marca: ");  
                                    brands[atm] = read.nextLine();
                                    System.out.print("Modelo: "); 
                                    models[atm] = read.nextLine();
                                    System.out.print("Color: ");  
                                    colors[atm] = read.nextLine();
                                          
                                    do{                                                                   
                                       System.out.print("Costo de la multa: $"); 
                                       mul = read.nextLine();
                                       if(mul.length() <= 0){ exists = false; break; }
                                       else{
                                          for(int j = 0; j < mul.length(); j++)
                                             if(mul.charAt(j) == '0' || mul.charAt(j) == '1' || mul.charAt(j) == '2' || mul.charAt(j) == '3' || mul.charAt(j) == '4' || mul.charAt(j) == '5' ||
                                                        mul.charAt(j) == '6' || mul.charAt(j) == '7' || mul.charAt(j) == '8' || mul.charAt(j) == '9' || mul.charAt(j) == '.' || mul.charAt(j) == ','  )
                                                exists = true;
                                             else{ System.out.println("Valor de la multa no valida"); exists = false; 
                                                break; } 
                                                 
                                       }    
                                       if(exists){ fines[atm] = Float.parseFloat(mul); }                       
                                    }while(exists != true);
                                    System.out.println(); atm++;
                                    System.out.println("Registro Agregado con Exito");
                                    System.out.println();
                                 }else System.out.println("Numero de folio no valido, ingrese uno nuevo en el rango [1 - 100]");
                              }
                        }
                     }    
               break;
            
            case '2': 
               exists = false;  
               if(atm > 0){ 
                    
                  System.out.println();
                  System.out.print("Ingresa el Folio: ");
                  fol = read.nextLine();
                  
                  if(fol.length() <= 0){ System.out.println("Numero de folio no valido, ingrese uno nuevo en el rango [1 - 100]"); break; } 
                  else
                     if(fol.length() > 9){ System.out.println("Numero de folio no valido, ingrese uno nuevo en el rango [1 - 100]");}
                     else{
                        for(int i = 0; i < fol.length(); i++)
                           if(fol.charAt(i) == '0' || fol.charAt(i) == '1' || fol.charAt(i) == '2' || fol.charAt(i) == '3' || fol.charAt(i) == '4' || fol.charAt(i) == '5' ||
                               fol.charAt(i) == '6' || fol.charAt(i) == '7' || fol.charAt(i) == '8' || fol.charAt(i) == '9')
                              exists = true;
                           else{ System.out.println("Folio No valido, el folio debe estar en el rango [1 - 100]"); exists = false;  break; } 
                          
                        if(exists){
                              
                           folio = Integer.parseInt(fol);
                           if(folio > 0 && folio <= 100){// cerrar llave
                              for(int i=0; i < atm; i++)
                                 if(folio == folios[i]){
                                    //System.out.printf("El Folio %d corresponde A: \n", folio);
                                    System.out.printf("Folio: %d\n", folios[i]);
                                    System.out.printf("Placas: %s\n", plates[i]);
                                    System.out.printf("Marca: %s\n", brands[i]);
                                    System.out.printf("Modelo: %s\n", models[i]);
                                    System.out.printf("Color: %s\n", colors[i]);
                                    System.out.printf("Multa: $%.2f\n\n", fines[i]);
                                    exists = false;
                                    break;
                                 }else exists = true;
                           }else{ System.out.println("\n Numero de folio no valido, ingrese uno nuevo en el rango [1 - 100]"); exists = false; };    
                           if(exists) System.out.printf("\nEl folio %d no existe en el registro \n", folio);  // Avisa si ese folio no se encuentra registrado.
                        }
                     }
                  }else System.out.println("Lo sentimos, aun no se ingresan registros"); // Comprueba si hay automotores registrados.
                        
               break; 	
            case '3': 
               
               if(atm > 0){
                  for(int i=0; i< atm -1; i++){
                     for(int j=i; j < atm ; j++){
                        if(folios[i] > folios[j]){
                           int auxFolios = folios[i];
                           folios[i] = folios[j];
                           folios[j] = auxFolios;
                        
                           String auxPlates = plates[i];
                           plates[i] = plates[j];
                           plates[j] = auxPlates;
                        
                           String auxbrands = brands[i];
                           brands[i] = brands[j];
                           brands[j] = auxbrands;
                        
                           String auxModels = models[i];
                           models[i] = models[j];
                           models[j] = auxModels;
                        
                           String auxColors = colors[i];
                           colors[i] = colors[j];
                           colors[j] = auxColors;
                        
                           float auxFines = fines[i];
                           fines[i] = fines[j];
                           fines[j] = auxFines;
                        }
                     }
                  } //change the range of every slot avaliable :)
                  System.out.println();
                  System.out.printf("%-7s %-16s\t %-18s\t %6s\t\n", "Folio", "Placas", "Modelos", "Multa");
                  System.out.printf("%-7s %-8s\t %-15s\t %6s\t\n", "----", "-------", "---------------------", "-------------");
                  for(int x=0; x < atm; x++){
                     System.out.printf("%-7d %-8s\t %-23s\t %6.2f MXN\t\n", folios[x], plates[x], models[x], fines[x]);
                  }
                  System.out.println();
               }
               else
                  System.out.println("Lo sentimos aun no hay registros agregados");
               break;
            case '4':  
               exists = false;
               if(atm > 0){
               
                  System.out.println();
                  System.out.print("Ingresa el Folio: ");
                  fol = read.nextLine();
                  if(fol.length() <= 0){ System.out.println("Numero de folio no valido, ingrese uno nuevo en el rango [1 - 100]"); break; } 
                  else
                     if(fol.length() > 9){ System.out.println("Numero de folio no valido, ingrese uno nuevo en el rango [1 - 100]"); exists = false;}
                     else{
                        for(int i = 0; i < fol.length(); i++)
                           if(fol.charAt(i) == '0' || fol.charAt(i) == '1' || fol.charAt(i) == '2' || fol.charAt(i) == '3' || fol.charAt(i) == '4' || fol.charAt(i) == '5' ||
                               fol.charAt(i) == '6' || fol.charAt(i) == '7' || fol.charAt(i) == '8' || fol.charAt(i) == '9')
                              exists = true;
                           else{ System.out.println("Folio No valido, el folio debe estar en el rango [1 - 100]"); exists = false; break; }
                        if(exists){
                        
                           folio = Integer.parseInt(fol);
                           if(folio > 0 && folio <= 100){
                           
                              for(int i= 0; i <= atm; i++)
                                 if(folio == folios[i]){
                                    exists = false;
                                    autoMotor = i;
                                    break;
                                 }else exists = true;
                           }else{ System.out.println("\n Numero de folio no valido, ingrese uno nuevo en el rango [1 - 100]"); exists = false; } // Avisa si el folio ingresado esta fuera del rango.
   
                           if(exists){ System.out.printf("\nEl folio %d no se encuentra registrado\n", folio); break;}                        
                              //Menu
                           if(exists == false)
                              do{
                                 System.out.printf("1) Placas: %s\n", plates[autoMotor]);
                                 System.out.printf("2) Marca: %s\n",  brands[autoMotor]);
                                 System.out.printf("3) Modelo: %s\n", models[autoMotor]);
                                 System.out.printf("4) Color: %s\n",  colors[autoMotor]);
                                 System.out.printf("5) Multa: %.2f\n",fines[autoMotor]);
                                 System.out.println("6) Nada");
                                    
                                 System.out.print("Ingrese una opcion [1-6]: ");
                                 opc2 = read.next().charAt(0);
                                 read.nextLine();
                                    
                                 switch(opc2){
                                    case '1': // Placas
                                       System.out.print("Ingrese el nuevo valor: ");
                                       plates[autoMotor] = read.nextLine();
                                       System.out.println("Edicion Exitosa");
                                       break;
                                    case '2':
                                       System.out.print("Ingrese el nuevo valor: ");
                                       brands[autoMotor] = read.nextLine();
                                       System.out.println("Edicion Exitosa");
                                    
                                       break;
                                    case '3':
                                       System.out.print("Ingrese el nuevo valor: ");
                                       models[autoMotor] = read.nextLine();
                                       System.out.println("Edicion Exitosa");
                                       break;
                                    case '4':
                                       System.out.print("Ingrese el nuevo valor: ");
                                       colors[autoMotor] = read.nextLine();
                                       System.out.println("Edicion Exitosa");
                                       break;
                                    case '5':
                                       do{                                                                   
                                          System.out.print("Ingrese el nuevo valor:$ "); 
                                          mul = read.nextLine();
                                               
                                          if(mul.length() <= 0){ fines[autoMotor] = 0; exists = false; 
                                             break; }
                                          else{
                                             for(int j = 0; j < mul.length(); j++)
                                                if(mul.charAt(j) == '0' || mul.charAt(j) == '1' || mul.charAt(j) == '2' || mul.charAt(j) == '3' || mul.charAt(j) == '4' || mul.charAt(j) == '5' ||
                                                       mul.charAt(j) == '6' || mul.charAt(j) == '7' || mul.charAt(j) == '8' || mul.charAt(j) == '9' || mul.charAt(j) == '.' || mul.charAt(j) == ',' )
                                                   exists = true;
                                                else{ System.out.println("Valor de la multa no valida"); exists = false; 
                                                   break; } 
                                          }   
                                          if(exists){ fines[autoMotor] = Float.parseFloat(mul); System.out.println("Edicion Exitosa"); }   
                                                                    
                                       }while(exists == false);
                                    break;
                                 case '6': 
                                    break;
                                 default: System.out.println("Opcion No valida :c");
                              }
                           
                           
                           }while(opc2 != '6');
                              
                           // Fin Menu
                           
                     }                  }
                  
               }else System.out.println("Lo sentimos, aun no se agregan registros");
               break;
            case '5': 
            exists = false;
               if(atm > 0){ //Tiene llave de cierre
                  
                  System.out.println();
                  System.out.print("Ingresa el Folio: ");
                  fol = read.nextLine();
                  
                  if(fol.length() <= 0){ System.out.println("Numero de folio no valido, ingrese uno nuevo en el rango [1 - 100]"); break; } 
                  else
                     if(fol.length() > 9) System.out.println("Numero de folio no valido, ingrese uno nuevo en el rango [1 - 100]");
                     else{ 
                        for(int i = 0; i < fol.length(); i++)
                           if(fol.charAt(i) == '0' || fol.charAt(i) == '1' || fol.charAt(i) == '2' || fol.charAt(i) == '3' || fol.charAt(i) == '4' || fol.charAt(i) == '5' ||
                               fol.charAt(i) == '6' || fol.charAt(i) == '7' || fol.charAt(i) == '8' || fol.charAt(i) == '9')
                               exists = true;
                           else{ System.out.println("Folio No valido, el folio debe estar en el rango [1 - 100]"); exists = false;  break; }
                           
                        if(exists){ 
                           folio = Integer.parseInt(fol);
                           if(folio > 0 && folio <= 100){ 
                              for(int i = 0; i <= atm; i++)
                                 if(folio == folios[i]){
                                    exists = false;
                                    autoMotor = i;
                                    delete = true;
                                    break;
                                 }else{ exists = true; delete = false;} 
                           }else{ System.out.println("\n Numero de folio no valido, ingrese uno nuevo en el rango [1 - 100]"); exists = false; }    
                           
                               if(exists) System.out.printf("\nEl folio %d no se encuentra registrado\n", folio); 
                                
                               if(delete){
                                 System.out.println("Datos del Automotor: ");
                                 System.out.printf("Folio: %d\n", folios[autoMotor]);
                                 System.out.printf("Placas: %s\n", plates[autoMotor]);
                                 System.out.printf("Marca: %s\n", brands[autoMotor]);
                                 System.out.printf("Modelo: %s\n", models[autoMotor]);
                                 System.out.printf("Color: %s\n", colors[autoMotor]);
                                 System.out.printf("Multa: %.2f\n", fines[autoMotor]);
                              
                                 System.out.printf("Estas seguro que quieres eliminar el registro? (si - no): ");
                                 String resp = read.nextLine();
                                 if(resp.toUpperCase().equals("SI")){
                                    for(int i = autoMotor ; i < atm -1; i++){
                                       folios[i] = folios[i+1];
                                       plates[i] = plates[i+1];
                                       brands[i] = brands[i+1];
                                       models[i] = models[i+1];
                                       colors[i] = colors[i+1];
                                       fines[i]  = fines[i+1];
                                    
                                    }
                                    folios[atm -1] = -1;
                                    plates[atm -1] = null;
                                    brands[atm -1] = null;
                                    models[atm -1] = null;
                                    colors[atm -1] = null;
                                    fines[atm -1]  = 0;
                                    atm--;
                                    System.out.println("El registro fue eliminado con exito");
                                 } else{ System.out.println("No se realizaron cambios en el registro"); break;}      
                              }                        
                        }
                                              
                     } // Cierre del  else
                     
                  }else System.out.println("Lo sentimos, aun no se ingresan registros"); // Fin Validar existencia de datos     
               break;
            case '6': 	
               System.out.println();
               System.out.println("--- -= Desarrolladores =- ---");
               System.out.println("  Luis Angel Guzman Garcia"); 
               System.out.println("  Jose Eduardo Pena Jimenez");
               System.out.println("  Aram Misael Guzman Boiso");
               System.out.printf("\n  Unidad 4: ORGANIZACION DE DATOS \n");
               System.out.printf("\n  Sistema de arreglos paralelos multidimencionales \n");
               System.out.printf("\n  30 de Noviembre de 2018 \n");
            
               break;
            default: System.out.println(); System.out.println("Opcion No valida:c"); System.out.println();;
         }   
      
      }while(opc != '6');      
      
   }
}