//проверка выбранных элементов всплывающего окошка
				if(combo1.getSelectedItem()=="рулоны"){
					y1 = x1 / 50 * 0.16;
				};
				if(combo1.getSelectedItem()=="паллеты"){
					y1 = x1 / 50 /12 * 0.96;
				};
				
				if(combo2.getSelectedItem()=="коробки"){
					y2 = x2 / 40 * 0.16;
				};
				if(combo2.getSelectedItem()=="паллеты"){
					y2 = x2 / 40 / 12 * 0.96;
				};
				if(combo3.getSelectedItem()=="бочки (200л)"){
					y3 = x3 / 180 * 0.36;
				};
				if(combo3.getSelectedItem()=="канистры (50л)"){
					y3 = x3 / 45 * 0.08;
				};
				//подсчет площади
				y = y1 + y2 + y3;
				x = x - y;
				//вывод в ответ результата и его округление
				a = "Ответ: " +(double)Math.round(y*100)/100 +" кв.м.  Осталость места: "+ (double)Math.round(x*100)/100+" кв.м.";
				label.setText(a);
				
			}
		//выводим сообщение о вводе неправильных данных
		}catch (Exception ex){JOptionPane.showMessageDialog(null,"Вы что-то ввели не так");}
