import java.util.*;

public class principal {
        public static void main(String[] args) {
            ArrayList<Electronica> inventario = new ArrayList<>();
            boolean retornaF = true;
            Scanner entrada = new Scanner(System.in);
            while(retornaF) {
                boolean retornaAlta = true;
                boolean retornaM = true;
                boolean retornaE = true;
                boolean retornaL = true;

                System.out.println("Bienvenido al sistema, ¿Que deseas hacer? introduce numero correspondiente");
                System.out.println("1._Alta");
                System.out.println("2._Modificar");
                System.out.println("3._Eliminar");
                System.out.println("4._Listado");
                System.out.println("5._cerrar");
                int n = entrada.nextInt();

                switch (n){
                    case 1: {
                        while (retornaAlta) {
                            System.out.println("bienvenido al sistema de altas, ¿Que deseas de dar de alta? introduce numero correspondiente");
                            System.out.println("1.-Teclado");
                            System.out.println("2.-Raton");
                            System.out.println("3.-Monitor");
                            System.out.println("4.-Impresora");
                            System.out.println("5.-Proyector");
                            System.out.println("6.-Cpu");
                            System.out.println("7.-cerrar");
                            n = entrada.nextInt();
                            if (n == 1) {
                                System.out.println("Introduce SKU:");
                                String sku = entrada.next();
                                System.out.println("Introduce Tipo de teclado:");
                                String tipo = entrada.next();
                                System.out.println("Introduce Modelo:");
                                String modelo = entrada.next();
                                System.out.println("Introduce Marca:");
                                String marca = entrada.next();
                                System.out.println("¿Tiene luces led?: introduce True si es si, False si es no");
                                Boolean luces = entrada.nextBoolean();
                                System.out.println("¿Tiene entrada bluetooh?: introduce True si es si, False si es no");
                                Boolean blue = entrada.nextBoolean();
                                Teclado teclado = new Teclado();
                                teclado.setSKU(sku);
                                teclado.setTipo(tipo);
                                teclado.setModelo(modelo);
                                teclado.setMarca(marca);
                                teclado.setLuces(luces);
                                teclado.setEntrada_bluethoot(blue);
                                inventario.add(teclado);
                                for (Electronica electronica : inventario) {
                                    System.out.println(electronica + " " + electronica.getClass().getSimpleName());//figuras_01[i]
                                }

                            }
                            if (n == 2) {
                                System.out.println("Introduce SKU:");
                                String sku = entrada.next();
                                System.out.println("Introduce Tipo :");
                                String tipo = entrada.next();
                                System.out.println("Introduce Modelo:");
                                String modelo = entrada.next();
                                System.out.println("Introduce Marca:");
                                String marca = entrada.next();
                                System.out.println("¿Tiene entrada bluetooh?: introduce True si es si, False si es no");
                                Boolean blue = entrada.nextBoolean();
                                Raton Raton = new Raton();
                                Raton.setSKU(sku);
                                Raton.setTipo(tipo);
                                Raton.setModelo(modelo);
                                Raton.setMarca(marca);
                                Raton.setEntrada_bluethoot(blue);
                                inventario.add(Raton);
                                for (Electronica electronica : inventario) {
                                    System.out.println(electronica + " " + electronica.getClass().getSimpleName());//figuras_01[i]
                                }

                            }
                            if (n == 3) {
                                System.out.println("Introduce SKU:");
                                String sku = entrada.next();
                                System.out.println("Introduce Tipo de monitor:");
                                String tipo = entrada.next();
                                System.out.println("Introduce Modelo:");
                                String modelo = entrada.next();
                                System.out.println("Introduce Marca:");
                                String marca = entrada.next();
                                System.out.println("Introduce pulgadas");
                                Integer pul = entrada.nextInt();
                                Monitor monitor = new Monitor();
                                monitor.setSKU(sku);
                                monitor.setTipo(tipo);
                                monitor.setModelo(modelo);
                                monitor.setMarca(marca);
                                monitor.setPulgadas(pul);
                                inventario.add(monitor);
                                for (Electronica electronica : inventario) {
                                    System.out.println(electronica + " " + electronica.getClass().getSimpleName());//figuras_01[i]
                                }

                            }
                            if (n == 4) {
                                System.out.println("Introduce SKU:");
                                String sku = entrada.next();
                                System.out.println("Introduce Tipo de impresora:");
                                String tipo = entrada.next();
                                System.out.println("Introduce Modelo:");
                                String modelo = entrada.next();
                                System.out.println("Introduce Marca:");
                                String marca = entrada.next();
                                System.out.println("¿Tiene escaner?: introduce True si es si, False si es no");
                                Boolean escan = entrada.nextBoolean();
                                Impresora impresora = new Impresora();
                                impresora.setSKU(sku);
                                impresora.setTipo(tipo);
                                impresora.setModelo(modelo);
                                impresora.setMarca(marca);
                                impresora.setEscaner(escan);
                                inventario.add(impresora);
                                for (Electronica electronica : inventario) {
                                    System.out.println(electronica + " " + electronica.getClass().getSimpleName());//figuras_01[i]
                                }

                            }
                            if (n == 5) {
                                System.out.println("Introduce SKU:");
                                String sku = entrada.next();
                                System.out.println("Introduce Tipo de proyector:");
                                String tipo = entrada.next();
                                System.out.println("Introduce Modelo:");
                                String modelo = entrada.next();
                                System.out.println("Introduce Marca:");
                                String marca = entrada.next();
                                System.out.println("Introduce pulgadas");
                                Integer pul = entrada.nextInt();
                                Proyector proyector = new Proyector();
                                proyector.setSKU(sku);
                                proyector.setTipo(tipo);
                                proyector.setModelo(modelo);
                                proyector.setMarca(marca);
                                proyector.setPulgadas(pul);
                                inventario.add(proyector);
                                for (Electronica electronica : inventario) {
                                    System.out.println(electronica + " " + electronica.getClass().getSimpleName());//figuras_01[i]
                                }

                            }
                            if (n == 6) {
                                System.out.println("Introduce SKU:");
                                String sku = entrada.next();
                                System.out.println("Introduce Tipo de cpu:");
                                String tipo = entrada.next();
                                System.out.println("Introduce Modelo:");
                                String modelo = entrada.next();
                                System.out.println("Introduce Marca:");
                                String marca = entrada.next();
                                System.out.println("Introduce ram");
                                Integer ram = entrada.nextInt();
                                System.out.println("Introduce procesador");
                                String procesador = entrada.next();
                                System.out.println("Introduce Disco duro");
                                Integer disco = entrada.nextInt();
                                CPU cpu = new CPU();
                                cpu.setSKU(sku);
                                cpu.setTipo(tipo);
                                cpu.setModelo(modelo);
                                cpu.setMarca(marca);
                                cpu.setRAM(ram);
                                cpu.setProcesador(procesador);
                                cpu.setDiscoDuro(disco);
                                inventario.add(cpu);
                                for (Electronica electronica : inventario) {
                                    System.out.println(electronica + " " + electronica.getClass().getSimpleName());//figuras_01[i]
                                }

                            }
                            if (n == 7) {
                                retornaAlta = false;
                            }
                        }
                    }
                    break;
                    case 2: {
                        while (retornaM) {
                            System.out.println("bienvenido al sistema de modificar, ¿Que deseas modificar? introduce numero correspondiente");
                            System.out.println("1.-Teclado");
                            System.out.println("2.-Raton");
                            System.out.println("3.-Monitor");
                            System.out.println("4.-Impresora");
                            System.out.println("5.-Proyector");
                            System.out.println("6.-Cpu");
                            System.out.println("7.-listar");
                            System.out.println("8.-cerrar");
                            n = entrada.nextInt();
                            if (n == 1) {
                                for (int i = 0; i < inventario.size(); i++) {
                                    System.out.println("Ingresa el sku del teclado que deseas modificar");
                                    String sku = entrada.next();
                                    if (inventario.get(i).getSKU().equals(sku)) {
                                        System.out.println("Introduce nuevo Tipo de teclado:");
                                        String tipo = entrada.next();
                                        System.out.println("Introduce nuevo  Modelo:");
                                        String modelo = entrada.next();
                                        System.out.println("Introduce nueva Marca:");
                                        String marca = entrada.next();
                                        System.out.println("¿Tiene luces led?: introduce True si es si, False si es no");
                                        Boolean luces = entrada.nextBoolean();
                                        System.out.println("¿Tiene entrada bluetooh?: introduce True si es si, False si es no");
                                        Boolean blue = entrada.nextBoolean();
                                        Teclado nuevot = new Teclado();
                                        nuevot.setSKU(sku);
                                        nuevot.setTipo(tipo);
                                        nuevot.setModelo(modelo);
                                        nuevot.setMarca(marca);
                                        nuevot.setLuces(luces);
                                        nuevot.setEntrada_bluethoot(blue);
                                        inventario.remove(i);
                                        inventario.add(nuevot);
                                    }
                                }

                            }
                            if (n == 2) {
                                for (int i = 0; i < inventario.size(); i++) {
                                    System.out.println("Ingresa el sku del raton que deseas modificar");
                                    String sku = entrada.next();
                                    if (inventario.get(i).getSKU().equals(sku)) {
                                        System.out.println("Introduce nuevo Tipo de teclado:");
                                        String tipo = entrada.next();
                                        System.out.println("Introduce nuevo  Modelo:");
                                        String modelo = entrada.next();
                                        System.out.println("Introduce nueva Marca:");
                                        String marca = entrada.next();
                                        System.out.println("¿Tiene entrada bluetooh?: introduce True si es si, False si es no");
                                        Boolean blue = entrada.nextBoolean();
                                        Raton nuevor = new Raton();
                                        nuevor.setSKU(sku);
                                        nuevor.setTipo(tipo);
                                        nuevor.setModelo(modelo);
                                        nuevor.setMarca(marca);
                                        nuevor.setEntrada_bluethoot(blue);
                                        inventario.remove(i);
                                        inventario.add(nuevor);
                                    }
                                }

                            }
                            if (n == 3) {
                                for (int i = 0; i < inventario.size(); i++) {
                                    System.out.println("Ingresa el sku del monitor que deseas modificar");
                                    String sku = entrada.next();
                                    if (inventario.get(i).getSKU().equals(sku)) {
                                        System.out.println("Introduce nuevo Tipo de teclado:");
                                        String tipo = entrada.next();
                                        System.out.println("Introduce nuevo  Modelo:");
                                        String modelo = entrada.next();
                                        System.out.println("Introduce nueva Marca:");
                                        String marca = entrada.next();
                                        System.out.println("Introduce nuevas pulgadas");
                                        Integer pul = entrada.nextInt();
                                        Monitor nuevom = new Monitor();
                                        nuevom.setSKU(sku);
                                        nuevom.setTipo(tipo);
                                        nuevom.setModelo(modelo);
                                        nuevom.setMarca(marca);
                                        nuevom.setPulgadas(pul);
                                        inventario.remove(i);
                                        inventario.add(nuevom);
                                    }
                                }

                            }
                            if (n == 4) {
                                for (int i = 0; i < inventario.size(); i++) {
                                    System.out.println("Ingresa el sku del impresora que deseas modificar");
                                    String sku = entrada.next();
                                    if (inventario.get(i).getSKU().equals(sku)) {
                                        System.out.println("Introduce nuevo Tipo de teclado:");
                                        String tipo = entrada.next();
                                        System.out.println("Introduce nuevo  Modelo:");
                                        String modelo = entrada.next();
                                        System.out.println("Introduce nueva Marca:");
                                        String marca = entrada.next();
                                        System.out.println("¿Tiene escaner?: introduce True si es si, False si es no");
                                        Boolean escan = entrada.nextBoolean();
                                        Impresora nuevoi = new Impresora();
                                        nuevoi.setSKU(sku);
                                        nuevoi.setTipo(tipo);
                                        nuevoi.setModelo(modelo);
                                        nuevoi.setMarca(marca);
                                        nuevoi.setEscaner(escan);
                                        inventario.remove(i);
                                        inventario.add(nuevoi);
                                    }
                                }

                            }
                            if (n == 5) {
                                for (int i = 0; i < inventario.size(); i++) {
                                    System.out.println("Ingresa el sku del proyector que deseas modificar");
                                    String sku = entrada.next();
                                    if (inventario.get(i).getSKU().equals(sku)) {
                                        System.out.println("Introduce nuevo Tipo de proyector:");
                                        String tipo = entrada.next();
                                        System.out.println("Introduce nuevo  Modelo:");
                                        String modelo = entrada.next();
                                        System.out.println("Introduce nueva Marca:");
                                        String marca = entrada.next();
                                        System.out.println("Introduce nuevas pulgadas");
                                        Integer pul = entrada.nextInt();
                                        Proyector nuevop = new Proyector();
                                        nuevop.setSKU(sku);
                                        nuevop.setTipo(tipo);
                                        nuevop.setModelo(modelo);
                                        nuevop.setMarca(marca);
                                        nuevop.setPulgadas(pul);
                                        inventario.remove(i);
                                        inventario.add(nuevop);
                                    }
                                }

                            }
                            if (n == 6) {
                                for (int i = 0; i < inventario.size(); i++) {
                                    System.out.println("Ingresa el sku del CPU que deseas modificar");
                                    String sku = entrada.next();
                                    if (inventario.get(i).getSKU().equals(sku)) {
                                        System.out.println("Introduce nuevo Tipo de CPU:");
                                        String tipo = entrada.next();
                                        System.out.println("Introduce nuevo  Modelo:");
                                        String modelo = entrada.next();
                                        System.out.println("Introduce nueva Marca:");
                                        String marca = entrada.next();
                                        System.out.println("Introduce ram");
                                        Integer ram = entrada.nextInt();
                                        System.out.println("Introduce procesador");
                                        String procesador = entrada.next();
                                        System.out.println("Introduce Disco duro");
                                        Integer disco = entrada.nextInt();
                                        CPU nuevocpu = new CPU();
                                        nuevocpu.setSKU(sku);
                                        nuevocpu.setTipo(tipo);
                                        nuevocpu.setModelo(modelo);
                                        nuevocpu.setMarca(marca);
                                        nuevocpu.setRAM(ram);
                                        nuevocpu.setProcesador(procesador);
                                        nuevocpu.setDiscoDuro(disco);
                                        inventario.remove(i);
                                        inventario.add(nuevocpu);
                                    }
                                }

                            }
                            if (n == 7) {
                                for (Electronica electronica : inventario) {
                                    System.out.println(electronica);//figuras_01[i]
                                }
                            }
                            if (n == 8) {
                                retornaM = false;
                            }

                        }
                    }
                    break;
                    case 3: {
                        while (retornaE) {
                            System.out.println("deseas eliminar un producto? presiona 1");
                            System.out.println("deseas cerrar? presiona 2");
                            n = entrada.nextInt();
                            if (n == 2) {
                                retornaE = false;
                            }
                            if(n == 1){
                                System.out.println("Introduce el codigo de barras del producto a eliminar");
                                String codigo = entrada.next();
                                Iterator<Electronica> it = inventario.iterator();
                                while (it.hasNext()) {
                                    Electronica a = it.next();
                                    if (a.getSKU().equals(codigo)) {
                                        a.setEstaBorrado(true);
                                    }
                                }
                            }
                        }
                    }
                    break;
                    case 4: {
                        while (retornaL) {
                            System.out.println("bienvenido al sistema de listado, ¿Que deseas listar? introduce numero correspondiente");
                            System.out.println("1.-Filtrar por numero de serie");
                            System.out.println("2.-Filtrar por marca");
                            System.out.println("3.-Filtrar por tipo de equipo");
                            System.out.println("4.-cerrar");
                            n = entrada.nextInt();
                            Collections.sort(inventario);
                            if (n == 1) {
                                for (int i = 0; i < inventario.size(); i++) {
                                        System.out.println(inventario.get(i));
                                }
                            }
                            if (n == 2) {
                                System.out.println("Ingresa la marca");
                                String marca = entrada.next();
                                for (int i = 0; i < inventario.size(); i++) {
                                    if (inventario.get(i).getMarca().equals(marca) && !inventario.get(i).EstaBorrado) {
                                        System.out.println(inventario.get(i));
                                    }
                                }
                            }
                            if (n == 3) {
                                System.out.println("Ingresa el tipo equipo");
                                String equipo = entrada.next().toUpperCase();
                                for (int i = 0; i < inventario.size(); i++) {
                                    if (inventario.get(i).getClass().getSimpleName().toUpperCase().equals(equipo) && !inventario.get(i).EstaBorrado) {
                                        System.out.println(inventario.get(i));
                                    }
                                }
                            }
                            if (n == 4) {
                                retornaL = false;
                            }

                        }
                    }
                        break;
                    case 5: {
                            retornaF = false;
                    }
                    break;
                    default: System.out.println("incorrecto, vuelve introducir");
                }

            }

        }
}


