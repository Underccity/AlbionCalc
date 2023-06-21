package constants;

import java.util.Map;
import java.util.HashMap;

public class ItemList {
	public enum Item{
		
//		T1_SEAWEED_1_0_offer("Лист1!B4"),						//Водоросли
//		T1_FISH_FRESHWATER_ALL_COMMON_1_0_offer("Лист1!C8"),	//Красноперка обыкновенная
//		T1_FISH_SALTWATER_ALL_COMMON_1_0_offer("Лист1!C16"),	//Сельдь обыкновенная
//		
//		T2_FISH_FRESHWATER_ALL_COMMON_1_0_offer("Лист1!C9"),	//Полосатый карп 
//		T2_FISH_SALTWATER_ALL_COMMON_1_0_offer("Лист1!C17"),	//Полосатая скумбрия
//		
//		T1_FISHSAUCE_LEVEL1_1_0_request("", "Лист1!B45"),		//Основной рыбный соус
//		T1_FISHSAUCE_LEVEL2_1_0_request("", "Лист1!B46"),		//Необычный рыбный соус
//		T1_FISHSAUCE_LEVEL3_1_0_request("", "Лист1!B47"),		//Особый рыбный соус
//		
//		T3_FISH_FRESHWATER_ALL_COMMON_1_0_offer("Лист1!C10"),	//Альбионский окунь
//		T3_FISH_FRESHWATER_FOREST_RARE_1_0_offer("Лист1!C24"),	//Речной угорь
//		T3_FISH_FRESHWATER_MOUNTAIN_RARE_1_0_offer("Лист1!C29"),//Синеглазка
//		T3_FISH_FRESHWATER_HIGHLANDS_RARE_1_0_offer("Лист1!C32"),//Пестроногий подкаменщик
//		T3_FISH_FRESHWATER_STEPPE_RARE_1_0_offer("Лист1!C26"),	//Мелководный краб
//		T3_FISH_FRESHWATER_SWAMP_RARE_1_0_offer("Лист1!C35"),	//Илистый моллюск
//		T3_FISH_FRESHWATER_AVALON_RARE_1_0_offer("Лист1!C38"),	//Дымчатый окунь
//		T3_FISH_SALTWATER_ALL_COMMON_1_0_offer("Лист1!C18"),	//Мелководная камбала
//		T3_FISH_SALTWATER_ALL_RARE_1_0_offer("Лист1!C40"),		//Мелководный кальмар
//		
//		T4_FISH_FRESHWATER_ALL_COMMON_1_0_offer("Лист1!C11"),	//Голубая Щука
//		T4_FISH_SALTWATER_ALL_COMMON_1_0_offer("Лист1!C19"),	//Голубая треска
//		
//		T5_FISH_FRESHWATER_ALL_COMMON_1_0_offer("Лист1!C12"),	//Пятнистая форель
//		T5_FISH_FRESHWATER_FOREST_RARE_1_0_offer("Лист1!C25"),	//Красноводный угорь
//		T5_FISH_FRESHWATER_MOUNTAIN_RARE_1_0_offer("Лист1!C30"),//Горная слепоглазка
//		T5_FISH_FRESHWATER_HIGHLANDS_RARE_1_0_offer("Лист1!C33"),//Камышовый подкаменщик
//		T5_FISH_FRESHWATER_STEPPE_RARE_1_0_offer("Лист1!C27"),	//Сухопутный краб
//		T5_FISH_FRESHWATER_SWAMP_RARE_1_0_offer("Лист1!C36"),	//Грязевой моллюск
//		T5_FISH_FRESHWATER_AVALON_RARE_1_0_offer("Лист1!C39"),	//Мглистый окунь
//		T5_FISH_SALTWATER_ALL_COMMON_1_0_offer("Лист1!C20"),	//Пятнистая зубатка
//		T5_FISH_SALTWATER_ALL_RARE_1_0_offer("Лист1!C41"),		//Срединный осьминог
//		
//		T6_FISH_FRESHWATER_ALL_COMMON_1_0_offer("Лист1!C13"),	//Яркоперый судак
//		T6_FISH_SALTWATER_ALL_COMMON_1_0_offer("Лист1!C21"),	//Твердокрылый лосось
//		
//		T7_FISH_FRESHWATER_ALL_COMMON_1_0_offer("Лист1!C14"),	//Мешкожаберный сом
//		T7_FISH_FRESHWATER_FOREST_RARE_1_0_offer(""),			//Болотный угорь
//		T7_FISH_FRESHWATER_MOUNTAIN_RARE_1_0_offer("Лист1!C31"),//Морозный смертеглаз
//		T7_FISH_FRESHWATER_HIGHLANDS_RARE_1_0_offer("Лист1!C34"),//Громокрылый подкаменщик
//		T7_FISH_FRESHWATER_STEPPE_RARE_1_0_offer("Лист1!C28"),	//Грязекраб
//		T7_FISH_FRESHWATER_SWAMP_RARE_1_0_offer("Лист1!C37"),	//Черноводный моллюск
//		T7_FISH_FRESHWATER_AVALON_RARE_1_0_offer("Лист1!C39"),	//Туманный окунь
//		T7_FISH_SALTWATER_ALL_COMMON_1_0_offer("Лист1!C22"),	//Голубой тунец
//		T7_FISH_SALTWATER_ALL_RARE_1_0_offer("Лист1!C42"),		//Глубинный кракен
//		
//		T8_FISH_FRESHWATER_ALL_COMMON_1_0_offer("Лист1!C15"),	//Речной осетр
//		T8_FISH_SALTWATER_ALL_BOSS_SHARK_1_0_offer("Лист1!C43"),//Акула
//		T8_FISH_SALTWATER_ALL_COMMON_1_0_offer("Лист1!C23"),	//Меч-рыба
//		T1_FISHCHOPS_1_0_request("", "Лист1!C5"),				//Разделанная рыба
//		
//		T3_FARM_CHICKEN_GROWN_1_0_offer("Лист8!O3"),//Курица
//		T3_MEAT_1_0_offer("Лист8!O4"),				//Куриное мясо
//		T3_EGG_1_0_offer("Лист8!O5"),				//Куриные яйца
//		T4_FARM_GOAT_GROWN_1_0_offer("Лист8!O6"),	//Коза
//		T4_MEAT_1_0_offer("Лист8!O7"),				//Козлятина
//		T4_BUTTER_1_0_offer("Лист8!O8"),			//Козье масло
//		T4_MILK_1_0_offer("Лист8!O9"),				//Козье молоко
//		T5_FARM_GOOSE_GROWN_1_0_offer("Лист8!O10"),	//Гусыня
//		T5_MEAT_1_0_offer("Лист8!O11"),				//Гусятина
//		T5_EGG_1_0_offer("Лист8!O12"),				//Гусиные яйца
//		T6_FARM_SHEEP_GROWN_1_0_offer("Лист8!O13"),	//Овца
//		T6_MEAT_1_0_offer("Лист8!O14"),				//Баранина
//		T6_MILK_1_0_offer("Лист8!O15"),				//Овечье молоко
//		T6_BUTTER_1_0_offer("Лист8!O16"),			//Овечье Масло
//		T8_MILK_1_0_offer("Лист8!O17"),				//Коровье молоко
//		T7_MEAT_1_0_offer("Лист8!O18"),				//Свинина
//		T7_FARM_PIG_GROWN_1_0_offer("Лист8!O19"),	//Свинья
//		
//		T2_AGARIC_1_0_offer("Лист8!R17"),			//Темногриб
//		T3_COMFREY_1_0_offer("Лист8!R18"),			//Ярколист
//		T4_BURDOCK_1_0_offer("Лист8!R19"),			//Зубчатый лопух
//		T5_TEASEL_1_0_offer("Лист8!R20"),			//Драконья ворсянка
//		T6_FOXGLOVE_1_0_offer("Лист8!R21"),			//Туманная наперстянка
//		T7_MULLEIN_1_0_offer("Лист8!R22"),			//Царский огнецвет
//		T8_YARROW_1_0_offer("Лист8!R23"),			//Упырий тысячеслистник
//		
//		T1_CARROT_1_0_offer("Лист8!R24"),			//Морковь
//		T2_BEAN_1_0_offer("Лист8!R25"),				//Бобы
//		T3_WHEAT_1_0_offer("Лист8!R26"),			//Сноп пшеницы
//		T3_FLOUR_1_0_offer("Лист8!R27"),			//Мука
//		T4_BREAD_1_0_offer("Лист8!R28"),			//Хлеб
//		T4_TURNIP_1_0_offer("Лист8!R29"),			//Репа
//		T5_CABBAGE_1_0_offer("Лист8!R30"),			//Капуста
//		T6_POTATO_1_0_offer("Лист8!R31"),			//Картофель
//		T7_CORN_1_0_offer("Лист8!R32"),				//Кукурузный початок
//		T8_PUMPKIN_1_0_offer("Лист8!R33"),			//Тыква
//		
//		T2_POTION_HEAL_1_0_offer("Лист8!B43"),		//Малый эликсир здоровья
//		T2_POTION_HEAL_1_0_request("", "Лист8!E43"),
//		
//		T2_POTION_ENERGY_1_0_offer("Лист8!B44"),	//Малый эликсир энергии
//		T2_POTION_ENERGY_1_0_request("", "Лист8!E44"),		
//
//		T3_POTION_REVIVE_1_0_offer("Лист8!B45"),	//Малое зелье гиганта
//		T3_POTION_REVIVE_1_0_request("", "Лист8!E45"),		
//		
//		T3_POTION_STONESKIN_1_0_offer("Лист8!B46"),	//Малый эликсир защиты
//		T3_POTION_STONESKIN_1_0_request("", "Лист8!E46"),	
//		
//		T3_POTION_SLOWFIELD_1_0_offer("Лист8!B47"),	//Малая вязкая настойка
//		T3_POTION_SLOWFIELD_1_0_request("", "Лист8!E47"),	
//		
//		T4_POTION_HEAL_1_0_offer("Лист8!B48"),		//Эликсир здоровья
//		T4_POTION_HEAL_1_0_request("", "Лист8!E48"),	
//		
//		T4_POTION_ENERGY_1_0_offer("Лист8!B49"),	//Эликсир энергии
//		T4_POTION_ENERGY_1_0_request("", "Лист8!E49"),	
//		
//		T4_POTION_COOLDOWN_1_0_offer("Лист8!B50"),	//Малый эликсир яда
//		T4_POTION_COOLDOWN_1_0_request("", "Лист8!E50"),	
//		
//		T5_POTION_REVIVE_1_0_offer("Лист8!B51"),	//Зелье гиганта
//		T5_POTION_REVIVE_1_0_request("", "Лист8!E51"),	
//		
//		T5_POTION_STONESKIN_1_0_offer("Лист8!B52"),	//Эликсир защиты
//		T5_POTION_STONESKIN_1_0_request("", "Лист8!E52"),	
//		
//		T5_POTION_SLOWFIELD_1_0_offer("Лист8!B53"),	//Вязкая настойка
//		T5_POTION_SLOWFIELD_1_0_request("", "Лист8!E53"),	
//		
//		T6_POTION_HEAL_1_0_offer("Лист8!B54"),		//Большой эликсир здоровья
//		T6_POTION_HEAL_1_0_request("", "Лист8!E54"),	
//		
//		T6_POTION_ENERGY_1_0_offer("Лист8!B55"),	//Большой эликсир энергии
//		T6_POTION_ENERGY_1_0_request("", "Лист8!E55"),	
//		
//		T6_POTION_COOLDOWN_1_0_offer("Лист8!B56"),	//Эликсир яда
//		T6_POTION_COOLDOWN_1_0_request("", "Лист8!E56"),	
//		
//		T7_POTION_REVIVE_1_0_offer("Лист8!B57"),	//Большое зелье гиганта
//		T7_POTION_REVIVE_1_0_request("", "Лист8!E57"),	
//		
//		T7_POTION_STONESKIN_1_0_offer("Лист8!B58"),	//Большой эликсир защиты
//		T7_POTION_STONESKIN_1_0_request("", "Лист8!E58"),	
//		
//		T7_POTION_SLOWFIELD_1_0_offer("Лист8!B59"),	//Большая вязкая настойка
//		T7_POTION_SLOWFIELD_1_0_request("", "Лист8!E59"),	
//		
//		T8_POTION_COOLDOWN_1_0_offer("Лист8!B60"),	//Большой эликсир яда
//		T8_POTION_COOLDOWN_1_0_request("", "Лист8!E60"),	
//		
//		T8_POTION_CLEANSE_1_0_offer("Лист8!B61"),	//Эликсир невидимости
//		T8_POTION_CLEANSE_1_0_request("", "Лист8!E61"),	
//		
//		T1_MEAL_GRILLEDFISH_1_0_offer("Лист8!B2"),	//Жареная рыба
//		T1_MEAL_GRILLEDFISH_1_0_request("", "Лист8!E2"),
//		
//		T1_MEAL_SOUP_1_0_offer("Лист8!B3"),			//Моковный суп(х10)
//		T1_MEAL_SOUP_1_0_request("", "Лист8!E3"),	
//		
//		T1_MEAL_SOUP_FISH_1_0_offer("Лист8!B4"),	//Суп из илистых
//		T1_MEAL_SOUP_FISH_1_0_request("", "Лист8!E4"),	
//		
//		T2_MEAL_SALAD_1_0_offer("Лист8!B5"),		//Салат с бобами(х10)
//		T2_MEAL_SALAD_1_0_request("", "Лист8!E5"),	
//		
//		T2_MEAL_SALAD_FISH_1_0_offer("Лист8!B6"),	//Салат с мелоководным
//		T2_MEAL_SALAD_FISH_1_0_request("", "Лист8!E6"),	
//		
//		T3_MEAL_SOUP_1_0_offer("Лист8!B7"),			//Пшеничная похлебка(х10)
//		T3_MEAL_SOUP_1_0_request("", "Лист8!E7"),	
//		
//		T3_MEAL_PIE_1_0_offer("Лист8!B8"),			//Пирог с курицей(х10)
//		T3_MEAL_PIE_1_0_request("", "Лист8!E8"),	
//		
//		T3_MEAL_PIE_FISH_1_0_offer("Лист8!B9"),		//Пирог с синеглазкой
//		T3_MEAL_PIE_FISH_1_0_request("", "Лист8!E9"),	
//		
//		T3_MEAL_OMELETTE_1_0_offer("Лист8!B10"),	//Омлет с курицей(х10)
//		T3_MEAL_OMELETTE_1_0_request("", "Лист8!E10"),	
//		
//		T3_MEAL_OMELETTE_FISH_1_0_offer("Лист8!B11"),//Омлет с мелководным
//		T3_MEAL_OMELETTE_FISH_1_0_request("", "Лист8!E11"),	
//		
//		T3_MEAL_ROAST_1_0_offer("Лист8!B12"),		//Жареный цыпленок(х10)
//		T3_MEAL_ROAST_1_0_request("", "Лист8!E12"),	
//		
//		T3_MEAL_ROAST_FISH_1_0_offer("Лист8!B13"),	//Жареный дымчатый
//		T3_MEAL_ROAST_FISH_1_0_request("", "Лист8!E13"),	
//		
//		T4_MEAL_SALAD_1_0_offer("Лист8!B14"),		//Салат с репой(х10)
//		T4_MEAL_SALAD_1_0_request("", "Лист8!E14"),	
//		
//		T4_MEAL_SALAD_FISH_1_0_offer("Лист8!B15"),	//Салат со срединным
//		T4_MEAL_SALAD_FISH_1_0_request("", "Лист8!E15"),	
//		
//		T4_MEAL_STEW_1_0_offer("Лист8!B16"),		//Жаркое из козлятины(х10)
//		T4_MEAL_STEW_1_0_request("", "Лист8!E16"),	
//		
//		T4_MEAL_STEW_FISH_1_0_offer("Лист8!B17"),	//Жаркое из речного
//		T4_MEAL_STEW_FISH_1_0_request("", "Лист8!E17"),	
//		
//		T4_MEAL_STEW_AVALON_1_0_offer("Лист8!B18"),	//Авалонское жаркое из козлятины(х10)
//		T4_MEAL_STEW_AVALON_1_0_request("", "Лист8!E18"),	
//		
//		T4_MEAL_SANDWICH_1_0_offer("Лист8!B19"),	//Сэндвич с козлятиной(х10)
//		T4_MEAL_SANDWICH_1_0_request("", "Лист8!E19"),	
//		
//		T4_MEAL_SANDWICH_FISH_1_0_offer("Лист8!B20"),//Сэндвич с пестроногим
//		T4_MEAL_SANDWICH_FISH_1_0_request("", "Лист8!E20"),	
//		
//		T5_MEAL_SOUP_1_0_offer("Лист8!B21"),		//Капустный суп(х10)
//		T5_MEAL_SOUP_1_0_request("", "Лист8!E21"),	
//		
//		T5_MEAL_SOUP_FISH_1_0_offer("Лист8!B22"),	//Суп из черноводных
//		T5_MEAL_SOUP_FISH_1_0_request("", "Лист8!E22"),	
//		
//		T5_MEAL_PIE_1_0_offer("Лист8!B23"),			//Пирог с гусятитной(х10)
//		T5_MEAL_PIE_1_0_request("", "Лист8!E23"),	
//		
//		T5_MEAL_OMELETTE_1_0_offer("Лист8!B24"),	//Омлет с гусятиной(х10)
//		T5_MEAL_OMELETTE_1_0_request("", "Лист8!E24"),	
//		
//		T5_MEAL_OMELETTE_FISH_1_0_offer("Лист8!B25"),//Омлет с сухопутным
//		T5_MEAL_OMELETTE_FISH_1_0_request("", "Лист8!E25"),	
//		
//		T5_MEAL_ROAST_1_0_offer("Лист8!B26"),		//Жареный гусь(х10)
//		T5_MEAL_ROAST_1_0_request("", "Лист8!E26"),	
//		
//		T5_MEAL_ROAST_FISH_1_0_offer("Лист8!B27"),	//Жареный мглистый
//		T5_MEAL_ROAST_FISH_1_0_request("", "Лист8!E27"),	
//		
//		T6_MEAL_SALAD_1_0_offer("Лист8!B28"),		//Картофельный салат(х10)
//		T6_MEAL_SALAD_1_0_request("", "Лист8!E28"),	
//		
//		T6_MEAL_SALAD_FISH_1_0_offer("Лист8!B29"),	//Салат с глубинным
//		T6_MEAL_SALAD_FISH_1_0_request("", "Лист8!E29"),	
//		
//		T6_MEAL_SALAD_FISH_1_1_1_offer("Лист8!B30"),	//Салат с глубинным т1
//		T6_MEAL_SALAD_FISH_1_1_1_request("", "Лист8!E30"),	
//		
//		T6_MEAL_SALAD_FISH_2_1_2_offer("Лист8!B31"),	//Салат с глубинным т2
//		T6_MEAL_SALAD_FISH_2_1_2_request("", "Лист8!E31"),	
//		
//		T6_MEAL_SALAD_FISH_3_1_3_offer("Лист8!B32"),	//Салат с глубинным т3
//		T6_MEAL_SALAD_FISH_3_1_3_request("", "Лист8!E32"),	
//		
//		T6_MEAL_STEW_1_0_offer("Лист8!B33"),		//Жаркое из баранины(х10)
//		T6_MEAL_STEW_1_0_request("", "Лист8!E33"),	
//		
//		T6_MEAL_STEW_FISH_1_0_offer("Лист8!B34"),	//Жаркое из красноводного
//		T6_MEAL_STEW_FISH_1_0_request("", "Лист8!E34"),	
//		
//		T6_MEAL_STEW_FISH_1_1_1_offer("Лист8!B35"),	//Жаркое из красноводного т1
//		T6_MEAL_STEW_FISH_1_1_1_request("", "Лист8!E35"),	
//		
//		T6_MEAL_STEW_FISH_2_1_2_offer("Лист8!B36"),	//Жаркое из красноводного т2
//		T6_MEAL_STEW_FISH_2_1_2_request("", "Лист8!E36"),	
//		
//		T6_MEAL_STEW_AVALON_3_1_3_offer("Лист8!B37"),	//Авалонское из баранины(х10)
//		T6_MEAL_STEW_AVALON_3_1_3_request("", "Лист8!E37"),	
//		
//		T6_MEAL_SANDWICH_1_0_offer("Лист8!B38"),	//Сэндвич с бараниной(х10)
//		T6_MEAL_SANDWICH_1_0_request("", "Лист8!E38"),	
//		
//		T6_MEAL_SANDWICH_FISH_1_0_offer("Лист8!B39"),//Сэндвич с камышовым
//		T6_MEAL_SANDWICH_FISH_1_0_request("", "Лист8!E39"),	
//		
//		T6_MEAL_SANDWICH_AVALON_1_0_offer("Лист8!B40"),	//Авалонский с баран(х10)
//		T6_MEAL_SANDWICH_AVALON_1_0_request("", "Лист8!E40"),	
//		
//		T7_MEAL_PIE_1_0_offer("Лист8!B41"),			//Пирог со свининой
//		T7_MEAL_PIE_1_0_request("", "Лист8!E41"),
//
//		T1_FACTION_SWAMP_TOKEN_1_1_0_offer("Лист5!B40;Лист5_1!B40;Лист5_2!B40;Лист5_3!B40;Лист5_4!B40"),	//Сердце лозы
//		T1_FACTION_MOUNTAIN_TOKEN_1_1_0_offer("Лист5!B41;Лист5_1!B41;Лист5_2!B41;Лист5_3!B41;Лист5_4!B41"),	//Сердце Горы
//		T1_FACTION_CAERLEON_TOKEN_1_1_0_offer("Лист5!B42;Лист5_1!B42;Лист5_2!B42;Лист5_3!B42;Лист5_4!B42"),	//Теневое сердце
//		T1_FACTION_STEPPE_TOKEN_1_1_0_offer("Лист5!B43;Лист5_1!B43;Лист5_2!B43;Лист5_3!B43;Лист5_4!B43"),	//Звериное сердце
//		T1_FACTION_HIGHLAND_TOKEN_1_1_0_offer("Лист5!B44;Лист5_1!B44;Лист5_2!B44;Лист5_3!B44;Лист5_4!B44"),	//Каменное сердце
//		T1_FACTION_FOREST_TOKEN_1_1_0_offer("Лист5!B45;Лист5_1!B45;Лист5_2!B45;Лист5_3!B45;Лист5_4!B45"),	//Древесное сердце
//		QUESTITEM_TOKEN_MISTS_1_0_offer("Лист5!B46;Лист5_1!B46;Лист5_2!B46;Лист5_3!B46;Лист5_4!B46"),		//Сказочный огонь
//		QUESTITEM_TOKEN_AVALON_1_0_offer("Лист5!B47;Лист5_1!B47;Лист5_2!B47;Лист5_3!B47;Лист5_4!B47"),		//Авалонская энергия
//		
//		T4_CAPEITEM_FW_BRIDGEWATCH_BP_1_0_offer("Лист5!B52"), 	//Герб города Bridgewatch
//		T4_CAPEITEM_FW_FORTSTERLING_BP_1_0_offer("Лист5!B53"), 	//Герб города Fort
//		T4_CAPEITEM_FW_LYMHURST_BP_1_0_offer("Лист5!B54"), 		//Герб города Lymhurst
//		T4_CAPEITEM_FW_MARTLOCK_BP_1_0_offer("Лист5!B55"), 		//Герб города Martlock
//		T4_CAPEITEM_FW_THETFORD_BP_1_0_offer("Лист5!B56"), 		//Герб города Thetford
//		T4_CAPEITEM_FW_CAERLEON_BP_1_0_offer("Лист5!B57"), 		//Герб города Caerleon
//		T4_CAPEITEM_HERETIC_BP_1_0_offer("Лист5!B58"), 			//Герб Еретиков
//		T4_CAPEITEM_UNDEAD_BP_1_0_offer("Лист5!B59"), 			//Герб Нежити
//		T4_CAPEITEM_KEEPER_BP_1_0_offer("Лист5!B60"), 			//Герб Хранителей
//		T4_CAPEITEM_MORGANA_BP_1_0_offer("Лист5!B61"), 			//Герб Морганы
//		T4_CAPEITEM_DEMON_BP_1_0_offer("Лист5!B62"), 			//Герб Демонов
//		T4_CAPEITEM_FW_BRECILIEN_BP_1_0_offer("Лист5!B63"), 	//Герб города Brecilien
//		T4_CAPEITEM_AVALON_BP_1_0_offer("Лист5!B64"), 			//Герб Авалона
//		
//		
//		T4_CAPE_1_0_offer("Лист5!D40"),	//Плащ Т4
//		T4_CAPE_2_0_offer("Лист5!D41"),		
//		T4_CAPE_3_0_offer("Лист5!D42"),		
//		T4_CAPE_4_0_offer("Лист5!D43"),		
//		
//		T4_CAPE_1_1_1_offer("Лист5!D44"),
//		T4_CAPE_1_2_1_offer("Лист5!D45"),
//		T4_CAPE_1_3_1_offer("Лист5!D46"),
//		T4_CAPE_1_4_1_offer("Лист5!D47"),
//		
//		T4_CAPE_2_1_2_offer("Лист5!D48"),
//		T4_CAPE_2_2_2_offer("Лист5!D49"),
//		T4_CAPE_2_3_2_offer("Лист5!D50"),
//		T4_CAPE_2_4_2_offer("Лист5!D51"),
//		
//		T4_CAPE_3_1_3_offer("Лист5!D52"),
//		T4_CAPE_3_2_3_offer("Лист5!D53"),
//		T4_CAPE_3_3_3_offer("Лист5!D54"),
//		T4_CAPE_3_4_3_offer("Лист5!D55"),
//		
//		T4_RUNE_1_0_offer("Лист5!B48"), 	//Руна Т4
//		T4_SOUL_1_0_offer("Лист5!B49"), 	//Душа Т4
//		T4_RELIC_1_0_offer("Лист5!B50"), 	//Реликт Т4
//		
//		
//		T4_CAPEITEM_FW_BRIDGEWATCH_1_0_offer("Лист5!B5"),		//Накидка знатока Bridgewatch
//		T4_CAPEITEM_FW_BRIDGEWATCH_2_0_offer("Лист5!B6"),		
//		T4_CAPEITEM_FW_BRIDGEWATCH_3_0_offer("Лист5!B7"),		
//		T4_CAPEITEM_FW_BRIDGEWATCH_4_0_offer("Лист5!B8"),		
//		
//		T4_CAPEITEM_FW_BRIDGEWATCH_1_1_1_offer("Лист5!B9"),
//		T4_CAPEITEM_FW_BRIDGEWATCH_1_2_1_offer("Лист5!B10"),
//		T4_CAPEITEM_FW_BRIDGEWATCH_1_3_1_offer("Лист5!B11"),
//		T4_CAPEITEM_FW_BRIDGEWATCH_1_4_1_offer("Лист5!B12"),
//		
//		T4_CAPEITEM_FW_BRIDGEWATCH_2_1_2_offer("Лист5!B13"),
//		T4_CAPEITEM_FW_BRIDGEWATCH_2_2_2_offer("Лист5!B14"),
//		T4_CAPEITEM_FW_BRIDGEWATCH_2_3_2_offer("Лист5!B15"),
//		T4_CAPEITEM_FW_BRIDGEWATCH_2_4_2_offer("Лист5!B16"),
//		
//		T4_CAPEITEM_FW_BRIDGEWATCH_3_1_3_offer("Лист5!B17"),
//		T4_CAPEITEM_FW_BRIDGEWATCH_3_2_3_offer("Лист5!B18"),
//		T4_CAPEITEM_FW_BRIDGEWATCH_3_3_3_offer("Лист5!B19"),
//		T4_CAPEITEM_FW_BRIDGEWATCH_3_4_3_offer("Лист5!B20"),
//		
//		T4_CAPEITEM_FW_BRIDGEWATCH_1_0_request("", "Лист5!B22"),		
//		T4_CAPEITEM_FW_BRIDGEWATCH_2_0_request("", "Лист5!B23"),		
//		T4_CAPEITEM_FW_BRIDGEWATCH_3_0_request("", "Лист5!B24"),		
//		T4_CAPEITEM_FW_BRIDGEWATCH_4_0_request("", "Лист5!B25"),		
//		
//		T4_CAPEITEM_FW_BRIDGEWATCH_1_1_1_request("", "Лист5!B26"),
//		T4_CAPEITEM_FW_BRIDGEWATCH_1_2_1_request("", "Лист5!B27"),
//		T4_CAPEITEM_FW_BRIDGEWATCH_1_3_1_request("", "Лист5!B28"),
//		T4_CAPEITEM_FW_BRIDGEWATCH_1_4_1_request("", "Лист5!B29"),
//		
//		T4_CAPEITEM_FW_BRIDGEWATCH_2_1_2_request("", "Лист5!B30"),
//		T4_CAPEITEM_FW_BRIDGEWATCH_2_2_2_request("", "Лист5!B31"),
//		T4_CAPEITEM_FW_BRIDGEWATCH_2_3_2_request("", "Лист5!B32"),
//		T4_CAPEITEM_FW_BRIDGEWATCH_2_4_2_request("", "Лист5!B33"),
//		
//		T4_CAPEITEM_FW_BRIDGEWATCH_3_1_3_request("", "Лист5!B34"),
//		T4_CAPEITEM_FW_BRIDGEWATCH_3_2_3_request("", "Лист5!B35"),
//		T4_CAPEITEM_FW_BRIDGEWATCH_3_3_3_request("", "Лист5!B36"),
//		T4_CAPEITEM_FW_BRIDGEWATCH_3_4_3_request("", "Лист5!B37"),
//		
//		
//		T4_CAPEITEM_FW_FORTSTERLING_1_0_offer("Лист5!F5"),		//Накидка знатока FortSterling
//		T4_CAPEITEM_FW_FORTSTERLING_2_0_offer("Лист5!F6"),		
//		T4_CAPEITEM_FW_FORTSTERLING_3_0_offer("Лист5!F7"),		
//		T4_CAPEITEM_FW_FORTSTERLING_4_0_offer("Лист5!F8"),		
//		
//		T4_CAPEITEM_FW_FORTSTERLING_1_1_1_offer("Лист5!F9"),
//		T4_CAPEITEM_FW_FORTSTERLING_1_2_1_offer("Лист5!F10"),
//		T4_CAPEITEM_FW_FORTSTERLING_1_3_1_offer("Лист5!F11"),
//		T4_CAPEITEM_FW_FORTSTERLING_1_4_1_offer("Лист5!F12"),
//		
//		T4_CAPEITEM_FW_FORTSTERLING_2_1_2_offer("Лист5!F13"),
//		T4_CAPEITEM_FW_FORTSTERLING_2_2_2_offer("Лист5!F14"),
//		T4_CAPEITEM_FW_FORTSTERLING_2_3_2_offer("Лист5!F15"),
//		T4_CAPEITEM_FW_FORTSTERLING_2_4_2_offer("Лист5!F16"),
//		
//		T4_CAPEITEM_FW_FORTSTERLING_3_1_3_offer("Лист5!F17"),
//		T4_CAPEITEM_FW_FORTSTERLING_3_2_3_offer("Лист5!F18"),
//		T4_CAPEITEM_FW_FORTSTERLING_3_3_3_offer("Лист5!F19"),
//		T4_CAPEITEM_FW_FORTSTERLING_3_4_3_offer("Лист5!F20"),
//		
//		T4_CAPEITEM_FW_FORTSTERLING_1_0_request("", "Лист5!F22"),		
//		T4_CAPEITEM_FW_FORTSTERLING_2_0_request("", "Лист5!F23"),		
//		T4_CAPEITEM_FW_FORTSTERLING_3_0_request("", "Лист5!F24"),		
//		T4_CAPEITEM_FW_FORTSTERLING_4_0_request("", "Лист5!F25"),		
//		
//		T4_CAPEITEM_FW_FORTSTERLING_1_1_1_request("", "Лист5!F26"),
//		T4_CAPEITEM_FW_FORTSTERLING_1_2_1_request("", "Лист5!F27"),
//		T4_CAPEITEM_FW_FORTSTERLING_1_3_1_request("", "Лист5!F28"),
//		T4_CAPEITEM_FW_FORTSTERLING_1_4_1_request("", "Лист5!F29"),
//		
//		T4_CAPEITEM_FW_FORTSTERLING_2_1_2_request("", "Лист5!F30"),
//		T4_CAPEITEM_FW_FORTSTERLING_2_2_2_request("", "Лист5!F31"),
//		T4_CAPEITEM_FW_FORTSTERLING_2_3_2_request("", "Лист5!F32"),
//		T4_CAPEITEM_FW_FORTSTERLING_2_4_2_request("", "Лист5!F33"),
//		
//		T4_CAPEITEM_FW_FORTSTERLING_3_1_3_request("", "Лист5!F34"),
//		T4_CAPEITEM_FW_FORTSTERLING_3_2_3_request("", "Лист5!F35"),
//		T4_CAPEITEM_FW_FORTSTERLING_3_3_3_request("", "Лист5!F36"),
//		T4_CAPEITEM_FW_FORTSTERLING_3_4_3_request("", "Лист5!F37"),
//		
//		T4_CAPEITEM_FW_LYMHURST_1_0_offer("Лист5!J5"),		//Накидка знатока Lymhurst
//		T4_CAPEITEM_FW_LYMHURST_2_0_offer("Лист5!J6"),		
//		T4_CAPEITEM_FW_LYMHURST_3_0_offer("Лист5!J7"),		
//		T4_CAPEITEM_FW_LYMHURST_4_0_offer("Лист5!J8"),		
//		
//		T4_CAPEITEM_FW_LYMHURST_1_1_1_offer("Лист5!J9"),
//		T4_CAPEITEM_FW_LYMHURST_1_2_1_offer("Лист5!J10"),
//		T4_CAPEITEM_FW_LYMHURST_1_3_1_offer("Лист5!J11"),
//		T4_CAPEITEM_FW_LYMHURST_1_4_1_offer("Лист5!J12"),
//		
//		T4_CAPEITEM_FW_LYMHURST_2_1_2_offer("Лист5!J13"),
//		T4_CAPEITEM_FW_LYMHURST_2_2_2_offer("Лист5!J14"),
//		T4_CAPEITEM_FW_LYMHURST_2_3_2_offer("Лист5!J15"),
//		T4_CAPEITEM_FW_LYMHURST_2_4_2_offer("Лист5!J16"),
//		
//		T4_CAPEITEM_FW_LYMHURST_3_1_3_offer("Лист5!J17"),
//		T4_CAPEITEM_FW_LYMHURST_3_2_3_offer("Лист5!J18"),
//		T4_CAPEITEM_FW_LYMHURST_3_3_3_offer("Лист5!J19"),
//		T4_CAPEITEM_FW_LYMHURST_3_4_3_offer("Лист5!J20"),
//		
//		T4_CAPEITEM_FW_LYMHURST_1_0_request("", "Лист5!J22"),		
//		T4_CAPEITEM_FW_LYMHURST_2_0_request("", "Лист5!J23"),		
//		T4_CAPEITEM_FW_LYMHURST_3_0_request("", "Лист5!J24"),		
//		T4_CAPEITEM_FW_LYMHURST_4_0_request("", "Лист5!J25"),		
//		
//		T4_CAPEITEM_FW_LYMHURST_1_1_1_request("", "Лист5!J26"),
//		T4_CAPEITEM_FW_LYMHURST_1_2_1_request("", "Лист5!J27"),
//		T4_CAPEITEM_FW_LYMHURST_1_3_1_request("", "Лист5!J28"),
//		T4_CAPEITEM_FW_LYMHURST_1_4_1_request("", "Лист5!J29"),
//		
//		T4_CAPEITEM_FW_LYMHURST_2_1_2_request("", "Лист5!J30"),
//		T4_CAPEITEM_FW_LYMHURST_2_2_2_request("", "Лист5!J31"),
//		T4_CAPEITEM_FW_LYMHURST_2_3_2_request("", "Лист5!J32"),
//		T4_CAPEITEM_FW_LYMHURST_2_4_2_request("", "Лист5!J33"),
//		
//		T4_CAPEITEM_FW_LYMHURST_3_1_3_request("", "Лист5!J34"),
//		T4_CAPEITEM_FW_LYMHURST_3_2_3_request("", "Лист5!J35"),
//		T4_CAPEITEM_FW_LYMHURST_3_3_3_request("", "Лист5!J36"),
//		T4_CAPEITEM_FW_LYMHURST_3_4_3_request("", "Лист5!J37"),
//		
//		T4_CAPEITEM_FW_MARTLOCK_1_0_offer("Лист5!N5"),		//Накидка знатока Martlock
//		T4_CAPEITEM_FW_MARTLOCK_2_0_offer("Лист5!N6"),		
//		T4_CAPEITEM_FW_MARTLOCK_3_0_offer("Лист5!N7"),		
//		T4_CAPEITEM_FW_MARTLOCK_4_0_offer("Лист5!N8"),		
//		
//		T4_CAPEITEM_FW_MARTLOCK_1_1_1_offer("Лист5!N9"),
//		T4_CAPEITEM_FW_MARTLOCK_1_2_1_offer("Лист5!N10"),
//		T4_CAPEITEM_FW_MARTLOCK_1_3_1_offer("Лист5!N11"),
//		T4_CAPEITEM_FW_MARTLOCK_1_4_1_offer("Лист5!N12"),
//		
//		T4_CAPEITEM_FW_MARTLOCK_2_1_2_offer("Лист5!N13"),
//		T4_CAPEITEM_FW_MARTLOCK_2_2_2_offer("Лист5!N14"),
//		T4_CAPEITEM_FW_MARTLOCK_2_3_2_offer("Лист5!N15"),
//		T4_CAPEITEM_FW_MARTLOCK_2_4_2_offer("Лист5!N16"),
//		
//		T4_CAPEITEM_FW_MARTLOCK_3_1_3_offer("Лист5!N17"),
//		T4_CAPEITEM_FW_MARTLOCK_3_2_3_offer("Лист5!N18"),
//		T4_CAPEITEM_FW_MARTLOCK_3_3_3_offer("Лист5!N19"),
//		T4_CAPEITEM_FW_MARTLOCK_3_4_3_offer("Лист5!N20"),
//		
//		T4_CAPEITEM_FW_MARTLOCK_1_0_request("", "Лист5!N22"),		
//		T4_CAPEITEM_FW_MARTLOCK_2_0_request("", "Лист5!N23"),		
//		T4_CAPEITEM_FW_MARTLOCK_3_0_request("", "Лист5!N24"),		
//		T4_CAPEITEM_FW_MARTLOCK_4_0_request("", "Лист5!N25"),		
//		
//		T4_CAPEITEM_FW_MARTLOCK_1_1_1_request("", "Лист5!N26"),
//		T4_CAPEITEM_FW_MARTLOCK_1_2_1_request("", "Лист5!N27"),
//		T4_CAPEITEM_FW_MARTLOCK_1_3_1_request("", "Лист5!N28"),
//		T4_CAPEITEM_FW_MARTLOCK_1_4_1_request("", "Лист5!N29"),
//		
//		T4_CAPEITEM_FW_MARTLOCK_2_1_2_request("", "Лист5!N30"),
//		T4_CAPEITEM_FW_MARTLOCK_2_2_2_request("", "Лист5!N31"),
//		T4_CAPEITEM_FW_MARTLOCK_2_3_2_request("", "Лист5!N32"),
//		T4_CAPEITEM_FW_MARTLOCK_2_4_2_request("", "Лист5!N33"),
//		
//		T4_CAPEITEM_FW_MARTLOCK_3_1_3_request("", "Лист5!N34"),
//		T4_CAPEITEM_FW_MARTLOCK_3_2_3_request("", "Лист5!N35"),
//		T4_CAPEITEM_FW_MARTLOCK_3_3_3_request("", "Лист5!N36"),
//		T4_CAPEITEM_FW_MARTLOCK_3_4_3_request("", "Лист5!N37"),
//		
//		T4_CAPEITEM_FW_THETFORD_1_0_offer("Лист5!R5"),		//Накидка знатока Therford
//		T4_CAPEITEM_FW_THETFORD_2_0_offer("Лист5!R6"),		
//		T4_CAPEITEM_FW_THETFORD_3_0_offer("Лист5!R7"),		
//		T4_CAPEITEM_FW_THETFORD_4_0_offer("Лист5!R8"),		
//		
//		T4_CAPEITEM_FW_THETFORD_1_1_1_offer("Лист5!R9"),
//		T4_CAPEITEM_FW_THETFORD_1_2_1_offer("Лист5!R10"),
//		T4_CAPEITEM_FW_THETFORD_1_3_1_offer("Лист5!R11"),
//		T4_CAPEITEM_FW_THETFORD_1_4_1_offer("Лист5!R12"),
//		
//		T4_CAPEITEM_FW_THETFORD_2_1_2_offer("Лист5!R13"),
//		T4_CAPEITEM_FW_THETFORD_2_2_2_offer("Лист5!R14"),
//		T4_CAPEITEM_FW_THETFORD_2_3_2_offer("Лист5!R15"),
//		T4_CAPEITEM_FW_THETFORD_2_4_2_offer("Лист5!R16"),
//		
//		T4_CAPEITEM_FW_THETFORD_3_1_3_offer("Лист5!R17"),
//		T4_CAPEITEM_FW_THETFORD_3_2_3_offer("Лист5!R18"),
//		T4_CAPEITEM_FW_THETFORD_3_3_3_offer("Лист5!R19"),
//		T4_CAPEITEM_FW_THETFORD_3_4_3_offer("Лист5!R20"),
//		
//		T4_CAPEITEM_FW_THETFORD_1_0_request("", "Лист5!R22"),		
//		T4_CAPEITEM_FW_THETFORD_2_0_request("", "Лист5!R23"),		
//		T4_CAPEITEM_FW_THETFORD_3_0_request("", "Лист5!R24"),		
//		T4_CAPEITEM_FW_THETFORD_4_0_request("", "Лист5!R25"),		
//		
//		T4_CAPEITEM_FW_THETFORD_1_1_1_request("", "Лист5!R26"),
//		T4_CAPEITEM_FW_THETFORD_1_2_1_request("", "Лист5!R27"),
//		T4_CAPEITEM_FW_THETFORD_1_3_1_request("", "Лист5!R28"),
//		T4_CAPEITEM_FW_THETFORD_1_4_1_request("", "Лист5!R29"),
//		
//		T4_CAPEITEM_FW_THETFORD_2_1_2_request("", "Лист5!R30"),
//		T4_CAPEITEM_FW_THETFORD_2_2_2_request("", "Лист5!R31"),
//		T4_CAPEITEM_FW_THETFORD_2_3_2_request("", "Лист5!R32"),
//		T4_CAPEITEM_FW_THETFORD_2_4_2_request("", "Лист5!R33"),
//		
//		T4_CAPEITEM_FW_THETFORD_3_1_3_request("", "Лист5!R34"),
//		T4_CAPEITEM_FW_THETFORD_3_2_3_request("", "Лист5!R35"),
//		T4_CAPEITEM_FW_THETFORD_3_3_3_request("", "Лист5!R36"),
//		T4_CAPEITEM_FW_THETFORD_3_4_3_request("", "Лист5!R37"),
//		
//		T4_CAPEITEM_FW_CAERLEON_1_0_offer("Лист5!V5"),		//Плащ города Caerleon
//		T4_CAPEITEM_FW_CAERLEON_2_0_offer("Лист5!V6"),		
//		T4_CAPEITEM_FW_CAERLEON_3_0_offer("Лист5!V7"),		
//		T4_CAPEITEM_FW_CAERLEON_4_0_offer("Лист5!V8"),		
//		
//		T4_CAPEITEM_FW_CAERLEON_1_1_1_offer("Лист5!V9"),
//		T4_CAPEITEM_FW_CAERLEON_1_2_1_offer("Лист5!V10"),
//		T4_CAPEITEM_FW_CAERLEON_1_3_1_offer("Лист5!V11"),
//		T4_CAPEITEM_FW_CAERLEON_1_4_1_offer("Лист5!V12"),
//		
//		T4_CAPEITEM_FW_CAERLEON_2_1_2_offer("Лист5!V13"),
//		T4_CAPEITEM_FW_CAERLEON_2_2_2_offer("Лист5!V14"),
//		T4_CAPEITEM_FW_CAERLEON_2_3_2_offer("Лист5!V15"),
//		T4_CAPEITEM_FW_CAERLEON_2_4_2_offer("Лист5!V16"),
//		
//		T4_CAPEITEM_FW_CAERLEON_3_1_3_offer("Лист5!V17"),
//		T4_CAPEITEM_FW_CAERLEON_3_2_3_offer("Лист5!V18"),
//		T4_CAPEITEM_FW_CAERLEON_3_3_3_offer("Лист5!V19"),
//		T4_CAPEITEM_FW_CAERLEON_3_4_3_offer("Лист5!V20"),
//		
//		T4_CAPEITEM_FW_CAERLEON_1_0_request("", "Лист5!V22"),		
//		T4_CAPEITEM_FW_CAERLEON_2_0_request("", "Лист5!V23"),		
//		T4_CAPEITEM_FW_CAERLEON_3_0_request("", "Лист5!V24"),		
//		T4_CAPEITEM_FW_CAERLEON_4_0_request("", "Лист5!V25"),		
//		
//		T4_CAPEITEM_FW_CAERLEON_1_1_1_request("", "Лист5!V26"),
//		T4_CAPEITEM_FW_CAERLEON_1_2_1_request("", "Лист5!V27"),
//		T4_CAPEITEM_FW_CAERLEON_1_3_1_request("", "Лист5!V28"),
//		T4_CAPEITEM_FW_CAERLEON_1_4_1_request("", "Лист5!V29"),
//		
//		T4_CAPEITEM_FW_CAERLEON_2_1_2_request("", "Лист5!V30"),
//		T4_CAPEITEM_FW_CAERLEON_2_2_2_request("", "Лист5!V31"),
//		T4_CAPEITEM_FW_CAERLEON_2_3_2_request("", "Лист5!V32"),
//		T4_CAPEITEM_FW_CAERLEON_2_4_2_request("", "Лист5!V33"),
//		
//		T4_CAPEITEM_FW_CAERLEON_3_1_3_request("", "Лист5!V34"),
//		T4_CAPEITEM_FW_CAERLEON_3_2_3_request("", "Лист5!V35"),
//		T4_CAPEITEM_FW_CAERLEON_3_3_3_request("", "Лист5!V36"),
//		T4_CAPEITEM_FW_CAERLEON_3_4_3_request("", "Лист5!V37"),
//		
//		T4_CAPEITEM_HERETIC_1_0_offer("Лист5!Z5"),		//Плащ еретиков
//		T4_CAPEITEM_HERETIC_2_0_offer("Лист5!Z6"),		
//		T4_CAPEITEM_HERETIC_3_0_offer("Лист5!Z7"),		
//		T4_CAPEITEM_HERETIC_4_0_offer("Лист5!Z8"),		
//		
//		T4_CAPEITEM_HERETIC_1_1_1_offer("Лист5!Z9"),
//		T4_CAPEITEM_HERETIC_1_2_1_offer("Лист5!Z10"),
//		T4_CAPEITEM_HERETIC_1_3_1_offer("Лист5!Z11"),
//		T4_CAPEITEM_HERETIC_1_4_1_offer("Лист5!Z12"),
//		
//		T4_CAPEITEM_HERETIC_2_1_2_offer("Лист5!Z13"),
//		T4_CAPEITEM_HERETIC_2_2_2_offer("Лист5!Z14"),
//		T4_CAPEITEM_HERETIC_2_3_2_offer("Лист5!Z15"),
//		T4_CAPEITEM_HERETIC_2_4_2_offer("Лист5!Z16"),
//		
//		T4_CAPEITEM_HERETIC_3_1_3_offer("Лист5!Z17"),
//		T4_CAPEITEM_HERETIC_3_2_3_offer("Лист5!Z18"),
//		T4_CAPEITEM_HERETIC_3_3_3_offer("Лист5!Z19"),
//		T4_CAPEITEM_HERETIC_3_4_3_offer("Лист5!Z20"),
//		
//		T4_CAPEITEM_HERETIC_1_0_request("", "Лист5!Z22"),		
//		T4_CAPEITEM_HERETIC_2_0_request("", "Лист5!Z23"),		
//		T4_CAPEITEM_HERETIC_3_0_request("", "Лист5!Z24"),		
//		T4_CAPEITEM_HERETIC_4_0_request("", "Лист5!Z25"),		
//		
//		T4_CAPEITEM_HERETIC_1_1_1_request("", "Лист5!Z26"),
//		T4_CAPEITEM_HERETIC_1_2_1_request("", "Лист5!Z27"),
//		T4_CAPEITEM_HERETIC_1_3_1_request("", "Лист5!Z28"),
//		T4_CAPEITEM_HERETIC_1_4_1_request("", "Лист5!Z29"),
//		
//		T4_CAPEITEM_HERETIC_2_1_2_request("", "Лист5!Z30"),
//		T4_CAPEITEM_HERETIC_2_2_2_request("", "Лист5!Z31"),
//		T4_CAPEITEM_HERETIC_2_3_2_request("", "Лист5!Z32"),
//		T4_CAPEITEM_HERETIC_2_4_2_request("", "Лист5!Z33"),
//		
//		T4_CAPEITEM_HERETIC_3_1_3_request("", "Лист5!Z34"),
//		T4_CAPEITEM_HERETIC_3_2_3_request("", "Лист5!Z35"),
//		T4_CAPEITEM_HERETIC_3_3_3_request("", "Лист5!Z36"),
//		T4_CAPEITEM_HERETIC_3_4_3_request("", "Лист5!Z37"),
//		
//		T4_CAPEITEM_UNDEAD_1_0_offer("Лист5!AD5"),		//Плащ Нежити
//		T4_CAPEITEM_UNDEAD_2_0_offer("Лист5!AD6"),		
//		T4_CAPEITEM_UNDEAD_3_0_offer("Лист5!AD7"),		
//		T4_CAPEITEM_UNDEAD_4_0_offer("Лист5!AD8"),		
//		
//		T4_CAPEITEM_UNDEAD_1_1_1_offer("Лист5!AD9"),
//		T4_CAPEITEM_UNDEAD_1_2_1_offer("Лист5!AD10"),
//		T4_CAPEITEM_UNDEAD_1_3_1_offer("Лист5!AD11"),
//		T4_CAPEITEM_UNDEAD_1_4_1_offer("Лист5!AD12"),
//		
//		T4_CAPEITEM_UNDEAD_2_1_2_offer("Лист5!AD13"),
//		T4_CAPEITEM_UNDEAD_2_2_2_offer("Лист5!AD14"),
//		T4_CAPEITEM_UNDEAD_2_3_2_offer("Лист5!AD15"),
//		T4_CAPEITEM_UNDEAD_2_4_2_offer("Лист5!AD16"),
//		
//		T4_CAPEITEM_UNDEAD_3_1_3_offer("Лист5!AD17"),
//		T4_CAPEITEM_UNDEAD_3_2_3_offer("Лист5!AD18"),
//		T4_CAPEITEM_UNDEAD_3_3_3_offer("Лист5!AD19"),
//		T4_CAPEITEM_UNDEAD_3_4_3_offer("Лист5!AD20"),
//		
//		T4_CAPEITEM_UNDEAD_1_0_request("", "Лист5!AD22"),		
//		T4_CAPEITEM_UNDEAD_2_0_request("", "Лист5!AD23"),		
//		T4_CAPEITEM_UNDEAD_3_0_request("", "Лист5!AD24"),		
//		T4_CAPEITEM_UNDEAD_4_0_request("", "Лист5!AD25"),		
//		
//		T4_CAPEITEM_UNDEAD_1_1_1_request("", "Лист5!AD26"),
//		T4_CAPEITEM_UNDEAD_1_2_1_request("", "Лист5!AD27"),
//		T4_CAPEITEM_UNDEAD_1_3_1_request("", "Лист5!AD28"),
//		T4_CAPEITEM_UNDEAD_1_4_1_request("", "Лист5!AD29"),
//		
//		T4_CAPEITEM_UNDEAD_2_1_2_request("", "Лист5!AD30"),
//		T4_CAPEITEM_UNDEAD_2_2_2_request("", "Лист5!AD31"),
//		T4_CAPEITEM_UNDEAD_2_3_2_request("", "Лист5!AD32"),
//		T4_CAPEITEM_UNDEAD_2_4_2_request("", "Лист5!AD33"),
//		
//		T4_CAPEITEM_UNDEAD_3_1_3_request("", "Лист5!AD34"),
//		T4_CAPEITEM_UNDEAD_3_2_3_request("", "Лист5!AD35"),
//		T4_CAPEITEM_UNDEAD_3_3_3_request("", "Лист5!AD36"),
//		T4_CAPEITEM_UNDEAD_3_4_3_request("", "Лист5!AD37"),
//		
//		T4_CAPEITEM_KEEPER_1_0_offer("Лист5!AH5"),		//Плащ Хранителей
//		T4_CAPEITEM_KEEPER_2_0_offer("Лист5!AH6"),		
//		T4_CAPEITEM_KEEPER_3_0_offer("Лист5!AH7"),		
//		T4_CAPEITEM_KEEPER_4_0_offer("Лист5!AH8"),		
//		
//		T4_CAPEITEM_KEEPER_1_1_1_offer("Лист5!AH9"),
//		T4_CAPEITEM_KEEPER_1_2_1_offer("Лист5!AH10"),
//		T4_CAPEITEM_KEEPER_1_3_1_offer("Лист5!AH11"),
//		T4_CAPEITEM_KEEPER_1_4_1_offer("Лист5!AH12"),
//		
//		T4_CAPEITEM_KEEPER_2_1_2_offer("Лист5!AH13"),
//		T4_CAPEITEM_KEEPER_2_2_2_offer("Лист5!AH14"),
//		T4_CAPEITEM_KEEPER_2_3_2_offer("Лист5!AH15"),
//		T4_CAPEITEM_KEEPER_2_4_2_offer("Лист5!AH16"),
//		
//		T4_CAPEITEM_KEEPER_3_1_3_offer("Лист5!AH17"),
//		T4_CAPEITEM_KEEPER_3_2_3_offer("Лист5!AH18"),
//		T4_CAPEITEM_KEEPER_3_3_3_offer("Лист5!AH19"),
//		T4_CAPEITEM_KEEPER_3_4_3_offer("Лист5!AH20"),
//		
//		T4_CAPEITEM_KEEPER_1_0_request("", "Лист5!AH22"),		
//		T4_CAPEITEM_KEEPER_2_0_request("", "Лист5!AH23"),		
//		T4_CAPEITEM_KEEPER_3_0_request("", "Лист5!AH24"),		
//		T4_CAPEITEM_KEEPER_4_0_request("", "Лист5!AH25"),		
//		
//		T4_CAPEITEM_KEEPER_1_1_1_request("", "Лист5!AH26"),
//		T4_CAPEITEM_KEEPER_1_2_1_request("", "Лист5!AH27"),
//		T4_CAPEITEM_KEEPER_1_3_1_request("", "Лист5!AH28"),
//		T4_CAPEITEM_KEEPER_1_4_1_request("", "Лист5!AH29"),
//		
//		T4_CAPEITEM_KEEPER_2_1_2_request("", "Лист5!AH30"),
//		T4_CAPEITEM_KEEPER_2_2_2_request("", "Лист5!AH31"),
//		T4_CAPEITEM_KEEPER_2_3_2_request("", "Лист5!AH32"),
//		T4_CAPEITEM_KEEPER_2_4_2_request("", "Лист5!AH33"),
//		
//		T4_CAPEITEM_KEEPER_3_1_3_request("", "Лист5!AH34"),
//		T4_CAPEITEM_KEEPER_3_2_3_request("", "Лист5!AH35"),
//		T4_CAPEITEM_KEEPER_3_3_3_request("", "Лист5!AH36"),
//		T4_CAPEITEM_KEEPER_3_4_3_request("", "Лист5!AH37"),
//		
//		T4_CAPEITEM_MORGANA_1_0_offer("Лист5!AL5"),		//Плащ морганы
//		T4_CAPEITEM_MORGANA_2_0_offer("Лист5!AL6"),		
//		T4_CAPEITEM_MORGANA_3_0_offer("Лист5!AL7"),		
//		T4_CAPEITEM_MORGANA_4_0_offer("Лист5!AL8"),		
//		
//		T4_CAPEITEM_MORGANA_1_1_1_offer("Лист5!AL9"),
//		T4_CAPEITEM_MORGANA_1_2_1_offer("Лист5!AL10"),
//		T4_CAPEITEM_MORGANA_1_3_1_offer("Лист5!AL11"),
//		T4_CAPEITEM_MORGANA_1_4_1_offer("Лист5!AL12"),
//		
//		T4_CAPEITEM_MORGANA_2_1_2_offer("Лист5!AL13"),
//		T4_CAPEITEM_MORGANA_2_2_2_offer("Лист5!AL14"),
//		T4_CAPEITEM_MORGANA_2_3_2_offer("Лист5!AL15"),
//		T4_CAPEITEM_MORGANA_2_4_2_offer("Лист5!AL16"),
//		
//		T4_CAPEITEM_MORGANA_3_1_3_offer("Лист5!AL17"),
//		T4_CAPEITEM_MORGANA_3_2_3_offer("Лист5!AL18"),
//		T4_CAPEITEM_MORGANA_3_3_3_offer("Лист5!AL19"),
//		T4_CAPEITEM_MORGANA_3_4_3_offer("Лист5!AL20"),
//		
//		T4_CAPEITEM_MORGANA_1_0_request("", "Лист5!AL22"),		
//		T4_CAPEITEM_MORGANA_2_0_request("", "Лист5!AL23"),		
//		T4_CAPEITEM_MORGANA_3_0_request("", "Лист5!AL24"),		
//		T4_CAPEITEM_MORGANA_4_0_request("", "Лист5!AL25"),		
//		
//		T4_CAPEITEM_MORGANA_1_1_1_request("", "Лист5!AL26"),
//		T4_CAPEITEM_MORGANA_1_2_1_request("", "Лист5!AL27"),
//		T4_CAPEITEM_MORGANA_1_3_1_request("", "Лист5!AL28"),
//		T4_CAPEITEM_MORGANA_1_4_1_request("", "Лист5!AL29"),
//		
//		T4_CAPEITEM_MORGANA_2_1_2_request("", "Лист5!AL30"),
//		T4_CAPEITEM_MORGANA_2_2_2_request("", "Лист5!AL31"),
//		T4_CAPEITEM_MORGANA_2_3_2_request("", "Лист5!AL32"),
//		T4_CAPEITEM_MORGANA_2_4_2_request("", "Лист5!AL33"),
//		
//		T4_CAPEITEM_MORGANA_3_1_3_request("", "Лист5!AL34"),
//		T4_CAPEITEM_MORGANA_3_2_3_request("", "Лист5!AL35"),
//		T4_CAPEITEM_MORGANA_3_3_3_request("", "Лист5!AL36"),
//		T4_CAPEITEM_MORGANA_3_4_3_request("", "Лист5!AL37"),
//		
//		T4_CAPEITEM_DEMON_1_0_offer("Лист5!AP5"),		//Плащ демонов
//		T4_CAPEITEM_DEMON_2_0_offer("Лист5!AP6"),		
//		T4_CAPEITEM_DEMON_3_0_offer("Лист5!AP7"),		
//		T4_CAPEITEM_DEMON_4_0_offer("Лист5!AP8"),		
//		
//		T4_CAPEITEM_DEMON_1_1_1_offer("Лист5!AP9"),
//		T4_CAPEITEM_DEMON_1_2_1_offer("Лист5!AP10"),
//		T4_CAPEITEM_DEMON_1_3_1_offer("Лист5!AP11"),
//		T4_CAPEITEM_DEMON_1_4_1_offer("Лист5!AP12"),
//		
//		T4_CAPEITEM_DEMON_2_1_2_offer("Лист5!AP13"),
//		T4_CAPEITEM_DEMON_2_2_2_offer("Лист5!AP14"),
//		T4_CAPEITEM_DEMON_2_3_2_offer("Лист5!AP15"),
//		T4_CAPEITEM_DEMON_2_4_2_offer("Лист5!AP16"),
//		
//		T4_CAPEITEM_DEMON_3_1_3_offer("Лист5!AP17"),
//		T4_CAPEITEM_DEMON_3_2_3_offer("Лист5!AP18"),
//		T4_CAPEITEM_DEMON_3_3_3_offer("Лист5!AP19"),
//		T4_CAPEITEM_DEMON_3_4_3_offer("Лист5!AP20"),
//		
//		T4_CAPEITEM_DEMON_1_0_request("", "Лист5!AP22"),		
//		T4_CAPEITEM_DEMON_2_0_request("", "Лист5!AP23"),		
//		T4_CAPEITEM_DEMON_3_0_request("", "Лист5!AP24"),		
//		T4_CAPEITEM_DEMON_4_0_request("", "Лист5!AP25"),		
//		
//		T4_CAPEITEM_DEMON_1_1_1_request("", "Лист5!AP26"),
//		T4_CAPEITEM_DEMON_1_2_1_request("", "Лист5!AP27"),
//		T4_CAPEITEM_DEMON_1_3_1_request("", "Лист5!AP28"),
//		T4_CAPEITEM_DEMON_1_4_1_request("", "Лист5!AP29"),
//		
//		T4_CAPEITEM_DEMON_2_1_2_request("", "Лист5!AP30"),
//		T4_CAPEITEM_DEMON_2_2_2_request("", "Лист5!AP31"),
//		T4_CAPEITEM_DEMON_2_3_2_request("", "Лист5!AP32"),
//		T4_CAPEITEM_DEMON_2_4_2_request("", "Лист5!AP33"),
//		
//		T4_CAPEITEM_DEMON_3_1_3_request("", "Лист5!AP34"),
//		T4_CAPEITEM_DEMON_3_2_3_request("", "Лист5!AP35"),
//		T4_CAPEITEM_DEMON_3_3_3_request("", "Лист5!AP36"),
//		T4_CAPEITEM_DEMON_3_4_3_request("", "Лист5!AP37"),
//		
//		
//		T4_CAPEITEM_FW_BRECILIEN_1_0_offer("Лист5!AT5"),		//Плащ города brecilien
//		T4_CAPEITEM_FW_BRECILIEN_2_0_offer("Лист5!AT6"),		
//		T4_CAPEITEM_FW_BRECILIEN_3_0_offer("Лист5!AT7"),		
//		T4_CAPEITEM_FW_BRECILIEN_4_0_offer("Лист5!AT8"),		
//		
//		T4_CAPEITEM_FW_BRECILIEN_1_1_1_offer("Лист5!AT9"),
//		T4_CAPEITEM_FW_BRECILIEN_1_2_1_offer("Лист5!AT10"),
//		T4_CAPEITEM_FW_BRECILIEN_1_3_1_offer("Лист5!AT11"),
//		T4_CAPEITEM_FW_BRECILIEN_1_4_1_offer("Лист5!AT12"),
//		
//		T4_CAPEITEM_FW_BRECILIEN_2_1_2_offer("Лист5!AT13"),
//		T4_CAPEITEM_FW_BRECILIEN_2_2_2_offer("Лист5!AT14"),
//		T4_CAPEITEM_FW_BRECILIEN_2_3_2_offer("Лист5!AT15"),
//		T4_CAPEITEM_FW_BRECILIEN_2_4_2_offer("Лист5!AT16"),
//		
//		T4_CAPEITEM_FW_BRECILIEN_3_1_3_offer("Лист5!AT17"),
//		T4_CAPEITEM_FW_BRECILIEN_3_2_3_offer("Лист5!AT18"),
//		T4_CAPEITEM_FW_BRECILIEN_3_3_3_offer("Лист5!AT19"),
//		T4_CAPEITEM_FW_BRECILIEN_3_4_3_offer("Лист5!AT20"),
//		
//		T4_CAPEITEM_FW_BRECILIEN_1_0_request("", "Лист5!AT22"),		
//		T4_CAPEITEM_FW_BRECILIEN_2_0_request("", "Лист5!AT23"),		
//		T4_CAPEITEM_FW_BRECILIEN_3_0_request("", "Лист5!AT24"),		
//		T4_CAPEITEM_FW_BRECILIEN_4_0_request("", "Лист5!AT25"),		
//		
//		T4_CAPEITEM_FW_BRECILIEN_1_1_1_request("", "Лист5!AT26"),
//		T4_CAPEITEM_FW_BRECILIEN_1_2_1_request("", "Лист5!AT27"),
//		T4_CAPEITEM_FW_BRECILIEN_1_3_1_request("", "Лист5!AT28"),
//		T4_CAPEITEM_FW_BRECILIEN_1_4_1_request("", "Лист5!AT29"),
//		
//		T4_CAPEITEM_FW_BRECILIEN_2_1_2_request("", "Лист5!AT30"),
//		T4_CAPEITEM_FW_BRECILIEN_2_2_2_request("", "Лист5!AT31"),
//		T4_CAPEITEM_FW_BRECILIEN_2_3_2_request("", "Лист5!AT32"),
//		T4_CAPEITEM_FW_BRECILIEN_2_4_2_request("", "Лист5!AT33"),
//		
//		T4_CAPEITEM_FW_BRECILIEN_3_1_3_request("", "Лист5!AT34"),
//		T4_CAPEITEM_FW_BRECILIEN_3_2_3_request("", "Лист5!AT35"),
//		T4_CAPEITEM_FW_BRECILIEN_3_3_3_request("", "Лист5!AT36"),
//		T4_CAPEITEM_FW_BRECILIEN_3_4_3_request("", "Лист5!AT37"),
//		
//		T4_CAPEITEM_AVALON_1_0_offer("Лист5!AX5"),		//Авалонский плащ
//		T4_CAPEITEM_AVALON_2_0_offer("Лист5!AX6"),		
//		T4_CAPEITEM_AVALON_3_0_offer("Лист5!AX7"),		
//		T4_CAPEITEM_AVALON_4_0_offer("Лист5!AX8"),		
//		
//		T4_CAPEITEM_AVALON_1_1_1_offer("Лист5!AX9"),
//		T4_CAPEITEM_AVALON_1_2_1_offer("Лист5!AX10"),
//		T4_CAPEITEM_AVALON_1_3_1_offer("Лист5!AX11"),
//		T4_CAPEITEM_AVALON_1_4_1_offer("Лист5!AX12"),
//		
//		T4_CAPEITEM_AVALON_2_1_2_offer("Лист5!AX13"),
//		T4_CAPEITEM_AVALON_2_2_2_offer("Лист5!AX14"),
//		T4_CAPEITEM_AVALON_2_3_2_offer("Лист5!AX15"),
//		T4_CAPEITEM_AVALON_2_4_2_offer("Лист5!AX16"),
//		
//		T4_CAPEITEM_AVALON_3_1_3_offer("Лист5!AX17"),
//		T4_CAPEITEM_AVALON_3_2_3_offer("Лист5!AX18"),
//		T4_CAPEITEM_AVALON_3_3_3_offer("Лист5!AX19"),
//		T4_CAPEITEM_AVALON_3_4_3_offer("Лист5!AX20"),
//		
//		T4_CAPEITEM_AVALON_1_0_request("", "Лист5!AX22"),		
//		T4_CAPEITEM_AVALON_2_0_request("", "Лист5!AX23"),		
//		T4_CAPEITEM_AVALON_3_0_request("", "Лист5!AX24"),		
//		T4_CAPEITEM_AVALON_4_0_request("", "Лист5!AX25"),		
//		
//		T4_CAPEITEM_AVALON_1_1_1_request("", "Лист5!AX26"),
//		T4_CAPEITEM_AVALON_1_2_1_request("", "Лист5!AX27"),
//		T4_CAPEITEM_AVALON_1_3_1_request("", "Лист5!AX28"),
//		T4_CAPEITEM_AVALON_1_4_1_request("", "Лист5!AX29"),
//		
//		T4_CAPEITEM_AVALON_2_1_2_request("", "Лист5!AX30"),
//		T4_CAPEITEM_AVALON_2_2_2_request("", "Лист5!AX31"),
//		T4_CAPEITEM_AVALON_2_3_2_request("", "Лист5!AX32"),
//		T4_CAPEITEM_AVALON_2_4_2_request("", "Лист5!AX33"),
//		
//		T4_CAPEITEM_AVALON_3_1_3_request("", "Лист5!AX34"),
//		T4_CAPEITEM_AVALON_3_2_3_request("", "Лист5!AX35"),
//		T4_CAPEITEM_AVALON_3_3_3_request("", "Лист5!AX36"),
//		T4_CAPEITEM_AVALON_3_4_3_request("", "Лист5!AX37"),
//		
//		T5_CAPEITEM_FW_BRIDGEWATCH_BP_1_0_offer("Лист5_1!B52"), 	//Герб города Bridgewatch
//		T5_CAPEITEM_FW_FORTSTERLING_BP_1_0_offer("Лист5_1!B53"), 	//Герб города Fort
//		T5_CAPEITEM_FW_LYMHURST_BP_1_0_offer("Лист5_1!B54"), 		//Герб города Lymhurst
//		T5_CAPEITEM_FW_MARTLOCK_BP_1_0_offer("Лист5_1!B55"), 		//Герб города Martlock
//		T5_CAPEITEM_FW_THETFORD_BP_1_0_offer("Лист5_1!B56"), 		//Герб города Thetford
//		T5_CAPEITEM_FW_CAERLEON_BP_1_0_offer("Лист5_1!B57"), 		//Герб города Caerleon
//		T5_CAPEITEM_HERETIC_BP_1_0_offer("Лист5_1!B58"), 			//Герб Еретиков
//		T5_CAPEITEM_UNDEAD_BP_1_0_offer("Лист5_1!B59"), 			//Герб Нежити
//		T5_CAPEITEM_KEEPER_BP_1_0_offer("Лист5_1!B60"), 			//Герб Хранителей
//		T5_CAPEITEM_MORGANA_BP_1_0_offer("Лист5_1!B61"), 			//Герб Морганы
//		T5_CAPEITEM_DEMON_BP_1_0_offer("Лист5_1!B62"), 				//Герб Демонов
//		T5_CAPEITEM_FW_BRECILIEN_BP_1_0_offer("Лист5_1!B63"), 		//Герб города Brecilien
//		T5_CAPEITEM_AVALON_BP_1_0_offer("Лист5_1!B64"), 			//Герб Авалона
//		
//		
//		T5_CAPE_1_0_offer("Лист5_1!D40"),	//Плащ Т5
//		T5_CAPE_2_0_offer("Лист5_1!D41"),		
//		T5_CAPE_3_0_offer("Лист5_1!D42"),		
//		T5_CAPE_4_0_offer("Лист5_1!D43"),		
//		
//		T5_CAPE_1_1_1_offer("Лист5_1!D44"),
//		T5_CAPE_1_2_1_offer("Лист5_1!D45"),
//		T5_CAPE_1_3_1_offer("Лист5_1!D46"),
//		T5_CAPE_1_4_1_offer("Лист5_1!D47"),
//		
//		T5_CAPE_2_1_2_offer("Лист5_1!D48"),
//		T5_CAPE_2_2_2_offer("Лист5_1!D49"),
//		T5_CAPE_2_3_2_offer("Лист5_1!D50"),
//		T5_CAPE_2_4_2_offer("Лист5_1!D51"),
//		
//		T5_CAPE_3_1_3_offer("Лист5_1!D52"),
//		T5_CAPE_3_2_3_offer("Лист5_1!D53"),
//		T5_CAPE_3_3_3_offer("Лист5_1!D54"),
//		T5_CAPE_3_4_3_offer("Лист5_1!D55"),
//		
//		T5_RUNE_1_0_offer("Лист5_1!B48"), 	//Руна Т5
//		T5_SOUL_1_0_offer("Лист5_1!B49"), 	//Душа Т5
//		T5_RELIC_1_0_offer("Лист5_1!B50"), 	//Реликт Т5
//		
//		
//		T5_CAPEITEM_FW_BRIDGEWATCH_1_0_offer("Лист5_1!B5"),		//Накидка знатока Bridgewatch
//		T5_CAPEITEM_FW_BRIDGEWATCH_2_0_offer("Лист5_1!B6"),		
//		T5_CAPEITEM_FW_BRIDGEWATCH_3_0_offer("Лист5_1!B7"),		
//		T5_CAPEITEM_FW_BRIDGEWATCH_4_0_offer("Лист5_1!B8"),		
//		
//		T5_CAPEITEM_FW_BRIDGEWATCH_1_1_1_offer("Лист5_1!B9"),
//		T5_CAPEITEM_FW_BRIDGEWATCH_1_2_1_offer("Лист5_1!B10"),
//		T5_CAPEITEM_FW_BRIDGEWATCH_1_3_1_offer("Лист5_1!B11"),
//		T5_CAPEITEM_FW_BRIDGEWATCH_1_4_1_offer("Лист5_1!B12"),
//		
//		T5_CAPEITEM_FW_BRIDGEWATCH_2_1_2_offer("Лист5_1!B13"),
//		T5_CAPEITEM_FW_BRIDGEWATCH_2_2_2_offer("Лист5_1!B14"),
//		T5_CAPEITEM_FW_BRIDGEWATCH_2_3_2_offer("Лист5_1!B15"),
//		T5_CAPEITEM_FW_BRIDGEWATCH_2_4_2_offer("Лист5_1!B16"),
//		
//		T5_CAPEITEM_FW_BRIDGEWATCH_3_1_3_offer("Лист5_1!B17"),
//		T5_CAPEITEM_FW_BRIDGEWATCH_3_2_3_offer("Лист5_1!B18"),
//		T5_CAPEITEM_FW_BRIDGEWATCH_3_3_3_offer("Лист5_1!B19"),
//		T5_CAPEITEM_FW_BRIDGEWATCH_3_4_3_offer("Лист5_1!B20"),
//		
//		T5_CAPEITEM_FW_BRIDGEWATCH_1_0_request("", "Лист5_1!B22"),		
//		T5_CAPEITEM_FW_BRIDGEWATCH_2_0_request("", "Лист5_1!B23"),		
//		T5_CAPEITEM_FW_BRIDGEWATCH_3_0_request("", "Лист5_1!B24"),		
//		T5_CAPEITEM_FW_BRIDGEWATCH_4_0_request("", "Лист5_1!B25"),		
//		
//		T5_CAPEITEM_FW_BRIDGEWATCH_1_1_1_request("", "Лист5_1!B26"),
//		T5_CAPEITEM_FW_BRIDGEWATCH_1_2_1_request("", "Лист5_1!B27"),
//		T5_CAPEITEM_FW_BRIDGEWATCH_1_3_1_request("", "Лист5_1!B28"),
//		T5_CAPEITEM_FW_BRIDGEWATCH_1_4_1_request("", "Лист5_1!B29"),
//		
//		T5_CAPEITEM_FW_BRIDGEWATCH_2_1_2_request("", "Лист5_1!B30"),
//		T5_CAPEITEM_FW_BRIDGEWATCH_2_2_2_request("", "Лист5_1!B31"),
//		T5_CAPEITEM_FW_BRIDGEWATCH_2_3_2_request("", "Лист5_1!B32"),
//		T5_CAPEITEM_FW_BRIDGEWATCH_2_4_2_request("", "Лист5_1!B33"),
//		
//		T5_CAPEITEM_FW_BRIDGEWATCH_3_1_3_request("", "Лист5_1!B34"),
//		T5_CAPEITEM_FW_BRIDGEWATCH_3_2_3_request("", "Лист5_1!B35"),
//		T5_CAPEITEM_FW_BRIDGEWATCH_3_3_3_request("", "Лист5_1!B36"),
//		T5_CAPEITEM_FW_BRIDGEWATCH_3_4_3_request("", "Лист5_1!B37"),
//		
//		
//		T5_CAPEITEM_FW_FORTSTERLING_1_0_offer("Лист5_1!F5"),		//Накидка знатока FortSterling
//		T5_CAPEITEM_FW_FORTSTERLING_2_0_offer("Лист5_1!F6"),		
//		T5_CAPEITEM_FW_FORTSTERLING_3_0_offer("Лист5_1!F7"),		
//		T5_CAPEITEM_FW_FORTSTERLING_4_0_offer("Лист5_1!F8"),		
//		
//		T5_CAPEITEM_FW_FORTSTERLING_1_1_1_offer("Лист5_1!F9"),
//		T5_CAPEITEM_FW_FORTSTERLING_1_2_1_offer("Лист5_1!F10"),
//		T5_CAPEITEM_FW_FORTSTERLING_1_3_1_offer("Лист5_1!F11"),
//		T5_CAPEITEM_FW_FORTSTERLING_1_4_1_offer("Лист5_1!F12"),
//		
//		T5_CAPEITEM_FW_FORTSTERLING_2_1_2_offer("Лист5_1!F13"),
//		T5_CAPEITEM_FW_FORTSTERLING_2_2_2_offer("Лист5_1!F14"),
//		T5_CAPEITEM_FW_FORTSTERLING_2_3_2_offer("Лист5_1!F15"),
//		T5_CAPEITEM_FW_FORTSTERLING_2_4_2_offer("Лист5_1!F16"),
//		
//		T5_CAPEITEM_FW_FORTSTERLING_3_1_3_offer("Лист5_1!F17"),
//		T5_CAPEITEM_FW_FORTSTERLING_3_2_3_offer("Лист5_1!F18"),
//		T5_CAPEITEM_FW_FORTSTERLING_3_3_3_offer("Лист5_1!F19"),
//		T5_CAPEITEM_FW_FORTSTERLING_3_4_3_offer("Лист5_1!F20"),
//		
//		T5_CAPEITEM_FW_FORTSTERLING_1_0_request("", "Лист5_1!F22"),		
//		T5_CAPEITEM_FW_FORTSTERLING_2_0_request("", "Лист5_1!F23"),		
//		T5_CAPEITEM_FW_FORTSTERLING_3_0_request("", "Лист5_1!F24"),		
//		T5_CAPEITEM_FW_FORTSTERLING_4_0_request("", "Лист5_1!F25"),		
//		
//		T5_CAPEITEM_FW_FORTSTERLING_1_1_1_request("", "Лист5_1!F26"),
//		T5_CAPEITEM_FW_FORTSTERLING_1_2_1_request("", "Лист5_1!F27"),
//		T5_CAPEITEM_FW_FORTSTERLING_1_3_1_request("", "Лист5_1!F28"),
//		T5_CAPEITEM_FW_FORTSTERLING_1_4_1_request("", "Лист5_1!F29"),
//		
//		T5_CAPEITEM_FW_FORTSTERLING_2_1_2_request("", "Лист5_1!F30"),
//		T5_CAPEITEM_FW_FORTSTERLING_2_2_2_request("", "Лист5_1!F31"),
//		T5_CAPEITEM_FW_FORTSTERLING_2_3_2_request("", "Лист5_1!F32"),
//		T5_CAPEITEM_FW_FORTSTERLING_2_4_2_request("", "Лист5_1!F33"),
//		
//		T5_CAPEITEM_FW_FORTSTERLING_3_1_3_request("", "Лист5_1!F34"),
//		T5_CAPEITEM_FW_FORTSTERLING_3_2_3_request("", "Лист5_1!F35"),
//		T5_CAPEITEM_FW_FORTSTERLING_3_3_3_request("", "Лист5_1!F36"),
//		T5_CAPEITEM_FW_FORTSTERLING_3_4_3_request("", "Лист5_1!F37"),
//		
//		T5_CAPEITEM_FW_LYMHURST_1_0_offer("Лист5_1!J5"),		//Накидка знатока Lymhurst
//		T5_CAPEITEM_FW_LYMHURST_2_0_offer("Лист5_1!J6"),		
//		T5_CAPEITEM_FW_LYMHURST_3_0_offer("Лист5_1!J7"),		
//		T5_CAPEITEM_FW_LYMHURST_4_0_offer("Лист5_1!J8"),		
//		
//		T5_CAPEITEM_FW_LYMHURST_1_1_1_offer("Лист5_1!J9"),
//		T5_CAPEITEM_FW_LYMHURST_1_2_1_offer("Лист5_1!J10"),
//		T5_CAPEITEM_FW_LYMHURST_1_3_1_offer("Лист5_1!J11"),
//		T5_CAPEITEM_FW_LYMHURST_1_4_1_offer("Лист5_1!J12"),
//		
//		T5_CAPEITEM_FW_LYMHURST_2_1_2_offer("Лист5_1!J13"),
//		T5_CAPEITEM_FW_LYMHURST_2_2_2_offer("Лист5_1!J14"),
//		T5_CAPEITEM_FW_LYMHURST_2_3_2_offer("Лист5_1!J15"),
//		T5_CAPEITEM_FW_LYMHURST_2_4_2_offer("Лист5_1!J16"),
//		
//		T5_CAPEITEM_FW_LYMHURST_3_1_3_offer("Лист5_1!J17"),
//		T5_CAPEITEM_FW_LYMHURST_3_2_3_offer("Лист5_1!J18"),
//		T5_CAPEITEM_FW_LYMHURST_3_3_3_offer("Лист5_1!J19"),
//		T5_CAPEITEM_FW_LYMHURST_3_4_3_offer("Лист5_1!J20"),
//		
//		T5_CAPEITEM_FW_LYMHURST_1_0_request("", "Лист5_1!J22"),		
//		T5_CAPEITEM_FW_LYMHURST_2_0_request("", "Лист5_1!J23"),		
//		T5_CAPEITEM_FW_LYMHURST_3_0_request("", "Лист5_1!J24"),		
//		T5_CAPEITEM_FW_LYMHURST_4_0_request("", "Лист5_1!J25"),		
//		
//		T5_CAPEITEM_FW_LYMHURST_1_1_1_request("", "Лист5_1!J26"),
//		T5_CAPEITEM_FW_LYMHURST_1_2_1_request("", "Лист5_1!J27"),
//		T5_CAPEITEM_FW_LYMHURST_1_3_1_request("", "Лист5_1!J28"),
//		T5_CAPEITEM_FW_LYMHURST_1_4_1_request("", "Лист5_1!J29"),
//		
//		T5_CAPEITEM_FW_LYMHURST_2_1_2_request("", "Лист5_1!J30"),
//		T5_CAPEITEM_FW_LYMHURST_2_2_2_request("", "Лист5_1!J31"),
//		T5_CAPEITEM_FW_LYMHURST_2_3_2_request("", "Лист5_1!J32"),
//		T5_CAPEITEM_FW_LYMHURST_2_4_2_request("", "Лист5_1!J33"),
//		
//		T5_CAPEITEM_FW_LYMHURST_3_1_3_request("", "Лист5_1!J34"),
//		T5_CAPEITEM_FW_LYMHURST_3_2_3_request("", "Лист5_1!J35"),
//		T5_CAPEITEM_FW_LYMHURST_3_3_3_request("", "Лист5_1!J36"),
//		T5_CAPEITEM_FW_LYMHURST_3_4_3_request("", "Лист5_1!J37"),
//		
//		T5_CAPEITEM_FW_MARTLOCK_1_0_offer("Лист5_1!N5"),		//Накидка знатока Martlock
//		T5_CAPEITEM_FW_MARTLOCK_2_0_offer("Лист5_1!N6"),		
//		T5_CAPEITEM_FW_MARTLOCK_3_0_offer("Лист5_1!N7"),		
//		T5_CAPEITEM_FW_MARTLOCK_4_0_offer("Лист5_1!N8"),		
//		
//		T5_CAPEITEM_FW_MARTLOCK_1_1_1_offer("Лист5_1!N9"),
//		T5_CAPEITEM_FW_MARTLOCK_1_2_1_offer("Лист5_1!N10"),
//		T5_CAPEITEM_FW_MARTLOCK_1_3_1_offer("Лист5_1!N11"),
//		T5_CAPEITEM_FW_MARTLOCK_1_4_1_offer("Лист5_1!N12"),
//		
//		T5_CAPEITEM_FW_MARTLOCK_2_1_2_offer("Лист5_1!N13"),
//		T5_CAPEITEM_FW_MARTLOCK_2_2_2_offer("Лист5_1!N14"),
//		T5_CAPEITEM_FW_MARTLOCK_2_3_2_offer("Лист5_1!N15"),
//		T5_CAPEITEM_FW_MARTLOCK_2_4_2_offer("Лист5_1!N16"),
//		
//		T5_CAPEITEM_FW_MARTLOCK_3_1_3_offer("Лист5_1!N17"),
//		T5_CAPEITEM_FW_MARTLOCK_3_2_3_offer("Лист5_1!N18"),
//		T5_CAPEITEM_FW_MARTLOCK_3_3_3_offer("Лист5_1!N19"),
//		T5_CAPEITEM_FW_MARTLOCK_3_4_3_offer("Лист5_1!N20"),
//		
//		T5_CAPEITEM_FW_MARTLOCK_1_0_request("", "Лист5_1!N22"),		
//		T5_CAPEITEM_FW_MARTLOCK_2_0_request("", "Лист5_1!N23"),		
//		T5_CAPEITEM_FW_MARTLOCK_3_0_request("", "Лист5_1!N24"),		
//		T5_CAPEITEM_FW_MARTLOCK_4_0_request("", "Лист5_1!N25"),		
//		
//		T5_CAPEITEM_FW_MARTLOCK_1_1_1_request("", "Лист5_1!N26"),
//		T5_CAPEITEM_FW_MARTLOCK_1_2_1_request("", "Лист5_1!N27"),
//		T5_CAPEITEM_FW_MARTLOCK_1_3_1_request("", "Лист5_1!N28"),
//		T5_CAPEITEM_FW_MARTLOCK_1_4_1_request("", "Лист5_1!N29"),
//		
//		T5_CAPEITEM_FW_MARTLOCK_2_1_2_request("", "Лист5_1!N30"),
//		T5_CAPEITEM_FW_MARTLOCK_2_2_2_request("", "Лист5_1!N31"),
//		T5_CAPEITEM_FW_MARTLOCK_2_3_2_request("", "Лист5_1!N32"),
//		T5_CAPEITEM_FW_MARTLOCK_2_4_2_request("", "Лист5_1!N33"),
//		
//		T5_CAPEITEM_FW_MARTLOCK_3_1_3_request("", "Лист5_1!N34"),
//		T5_CAPEITEM_FW_MARTLOCK_3_2_3_request("", "Лист5_1!N35"),
//		T5_CAPEITEM_FW_MARTLOCK_3_3_3_request("", "Лист5_1!N36"),
//		T5_CAPEITEM_FW_MARTLOCK_3_4_3_request("", "Лист5_1!N37"),
//		
//		T5_CAPEITEM_FW_THETFORD_1_0_offer("Лист5_1!R5"),		//Накидка знатока Therford
//		T5_CAPEITEM_FW_THETFORD_2_0_offer("Лист5_1!R6"),		
//		T5_CAPEITEM_FW_THETFORD_3_0_offer("Лист5_1!R7"),		
//		T5_CAPEITEM_FW_THETFORD_4_0_offer("Лист5_1!R8"),		
//		
//		T5_CAPEITEM_FW_THETFORD_1_1_1_offer("Лист5_1!R9"),
//		T5_CAPEITEM_FW_THETFORD_1_2_1_offer("Лист5_1!R10"),
//		T5_CAPEITEM_FW_THETFORD_1_3_1_offer("Лист5_1!R11"),
//		T5_CAPEITEM_FW_THETFORD_1_4_1_offer("Лист5_1!R12"),
//		
//		T5_CAPEITEM_FW_THETFORD_2_1_2_offer("Лист5_1!R13"),
//		T5_CAPEITEM_FW_THETFORD_2_2_2_offer("Лист5_1!R14"),
//		T5_CAPEITEM_FW_THETFORD_2_3_2_offer("Лист5_1!R15"),
//		T5_CAPEITEM_FW_THETFORD_2_4_2_offer("Лист5_1!R16"),
//		
//		T5_CAPEITEM_FW_THETFORD_3_1_3_offer("Лист5_1!R17"),
//		T5_CAPEITEM_FW_THETFORD_3_2_3_offer("Лист5_1!R18"),
//		T5_CAPEITEM_FW_THETFORD_3_3_3_offer("Лист5_1!R19"),
//		T5_CAPEITEM_FW_THETFORD_3_4_3_offer("Лист5_1!R20"),
//		
//		T5_CAPEITEM_FW_THETFORD_1_0_request("", "Лист5_1!R22"),		
//		T5_CAPEITEM_FW_THETFORD_2_0_request("", "Лист5_1!R23"),		
//		T5_CAPEITEM_FW_THETFORD_3_0_request("", "Лист5_1!R24"),		
//		T5_CAPEITEM_FW_THETFORD_4_0_request("", "Лист5_1!R25"),		
//		
//		T5_CAPEITEM_FW_THETFORD_1_1_1_request("", "Лист5_1!R26"),
//		T5_CAPEITEM_FW_THETFORD_1_2_1_request("", "Лист5_1!R27"),
//		T5_CAPEITEM_FW_THETFORD_1_3_1_request("", "Лист5_1!R28"),
//		T5_CAPEITEM_FW_THETFORD_1_4_1_request("", "Лист5_1!R29"),
//		
//		T5_CAPEITEM_FW_THETFORD_2_1_2_request("", "Лист5_1!R30"),
//		T5_CAPEITEM_FW_THETFORD_2_2_2_request("", "Лист5_1!R31"),
//		T5_CAPEITEM_FW_THETFORD_2_3_2_request("", "Лист5_1!R32"),
//		T5_CAPEITEM_FW_THETFORD_2_4_2_request("", "Лист5_1!R33"),
//		
//		T5_CAPEITEM_FW_THETFORD_3_1_3_request("", "Лист5_1!R34"),
//		T5_CAPEITEM_FW_THETFORD_3_2_3_request("", "Лист5_1!R35"),
//		T5_CAPEITEM_FW_THETFORD_3_3_3_request("", "Лист5_1!R36"),
//		T5_CAPEITEM_FW_THETFORD_3_4_3_request("", "Лист5_1!R37"),
//		
//		T5_CAPEITEM_FW_CAERLEON_1_0_offer("Лист5_1!V5"),		//Плащ города Caerleon
//		T5_CAPEITEM_FW_CAERLEON_2_0_offer("Лист5_1!V6"),		
//		T5_CAPEITEM_FW_CAERLEON_3_0_offer("Лист5_1!V7"),		
//		T5_CAPEITEM_FW_CAERLEON_4_0_offer("Лист5_1!V8"),		
//		
//		T5_CAPEITEM_FW_CAERLEON_1_1_1_offer("Лист5_1!V9"),
//		T5_CAPEITEM_FW_CAERLEON_1_2_1_offer("Лист5_1!V10"),
//		T5_CAPEITEM_FW_CAERLEON_1_3_1_offer("Лист5_1!V11"),
//		T5_CAPEITEM_FW_CAERLEON_1_4_1_offer("Лист5_1!V12"),
//		
//		T5_CAPEITEM_FW_CAERLEON_2_1_2_offer("Лист5_1!V13"),
//		T5_CAPEITEM_FW_CAERLEON_2_2_2_offer("Лист5_1!V14"),
//		T5_CAPEITEM_FW_CAERLEON_2_3_2_offer("Лист5_1!V15"),
//		T5_CAPEITEM_FW_CAERLEON_2_4_2_offer("Лист5_1!V16"),
//		
//		T5_CAPEITEM_FW_CAERLEON_3_1_3_offer("Лист5_1!V17"),
//		T5_CAPEITEM_FW_CAERLEON_3_2_3_offer("Лист5_1!V18"),
//		T5_CAPEITEM_FW_CAERLEON_3_3_3_offer("Лист5_1!V19"),
//		T5_CAPEITEM_FW_CAERLEON_3_4_3_offer("Лист5_1!V20"),
//		
//		T5_CAPEITEM_FW_CAERLEON_1_0_request("", "Лист5_1!V22"),		
//		T5_CAPEITEM_FW_CAERLEON_2_0_request("", "Лист5_1!V23"),		
//		T5_CAPEITEM_FW_CAERLEON_3_0_request("", "Лист5_1!V24"),		
//		T5_CAPEITEM_FW_CAERLEON_4_0_request("", "Лист5_1!V25"),		
//		
//		T5_CAPEITEM_FW_CAERLEON_1_1_1_request("", "Лист5_1!V26"),
//		T5_CAPEITEM_FW_CAERLEON_1_2_1_request("", "Лист5_1!V27"),
//		T5_CAPEITEM_FW_CAERLEON_1_3_1_request("", "Лист5_1!V28"),
//		T5_CAPEITEM_FW_CAERLEON_1_4_1_request("", "Лист5_1!V29"),
//		
//		T5_CAPEITEM_FW_CAERLEON_2_1_2_request("", "Лист5_1!V30"),
//		T5_CAPEITEM_FW_CAERLEON_2_2_2_request("", "Лист5_1!V31"),
//		T5_CAPEITEM_FW_CAERLEON_2_3_2_request("", "Лист5_1!V32"),
//		T5_CAPEITEM_FW_CAERLEON_2_4_2_request("", "Лист5_1!V33"),
//		
//		T5_CAPEITEM_FW_CAERLEON_3_1_3_request("", "Лист5_1!V34"),
//		T5_CAPEITEM_FW_CAERLEON_3_2_3_request("", "Лист5_1!V35"),
//		T5_CAPEITEM_FW_CAERLEON_3_3_3_request("", "Лист5_1!V36"),
//		T5_CAPEITEM_FW_CAERLEON_3_4_3_request("", "Лист5_1!V37"),
//		
//		T5_CAPEITEM_HERETIC_1_0_offer("Лист5_1!Z5"),		//Плащ еретиков
//		T5_CAPEITEM_HERETIC_2_0_offer("Лист5_1!Z6"),		
//		T5_CAPEITEM_HERETIC_3_0_offer("Лист5_1!Z7"),		
//		T5_CAPEITEM_HERETIC_4_0_offer("Лист5_1!Z8"),		
//		
//		T5_CAPEITEM_HERETIC_1_1_1_offer("Лист5_1!Z9"),
//		T5_CAPEITEM_HERETIC_1_2_1_offer("Лист5_1!Z10"),
//		T5_CAPEITEM_HERETIC_1_3_1_offer("Лист5_1!Z11"),
//		T5_CAPEITEM_HERETIC_1_4_1_offer("Лист5_1!Z12"),
//		
//		T5_CAPEITEM_HERETIC_2_1_2_offer("Лист5_1!Z13"),
//		T5_CAPEITEM_HERETIC_2_2_2_offer("Лист5_1!Z14"),
//		T5_CAPEITEM_HERETIC_2_3_2_offer("Лист5_1!Z15"),
//		T5_CAPEITEM_HERETIC_2_4_2_offer("Лист5_1!Z16"),
//		
//		T5_CAPEITEM_HERETIC_3_1_3_offer("Лист5_1!Z17"),
//		T5_CAPEITEM_HERETIC_3_2_3_offer("Лист5_1!Z18"),
//		T5_CAPEITEM_HERETIC_3_3_3_offer("Лист5_1!Z19"),
//		T5_CAPEITEM_HERETIC_3_4_3_offer("Лист5_1!Z20"),
//		
//		T5_CAPEITEM_HERETIC_1_0_request("", "Лист5_1!Z22"),		
//		T5_CAPEITEM_HERETIC_2_0_request("", "Лист5_1!Z23"),		
//		T5_CAPEITEM_HERETIC_3_0_request("", "Лист5_1!Z24"),		
//		T5_CAPEITEM_HERETIC_4_0_request("", "Лист5_1!Z25"),		
//		
//		T5_CAPEITEM_HERETIC_1_1_1_request("", "Лист5_1!Z26"),
//		T5_CAPEITEM_HERETIC_1_2_1_request("", "Лист5_1!Z27"),
//		T5_CAPEITEM_HERETIC_1_3_1_request("", "Лист5_1!Z28"),
//		T5_CAPEITEM_HERETIC_1_4_1_request("", "Лист5_1!Z29"),
//		
//		T5_CAPEITEM_HERETIC_2_1_2_request("", "Лист5_1!Z30"),
//		T5_CAPEITEM_HERETIC_2_2_2_request("", "Лист5_1!Z31"),
//		T5_CAPEITEM_HERETIC_2_3_2_request("", "Лист5_1!Z32"),
//		T5_CAPEITEM_HERETIC_2_4_2_request("", "Лист5_1!Z33"),
//		
//		T5_CAPEITEM_HERETIC_3_1_3_request("", "Лист5_1!Z34"),
//		T5_CAPEITEM_HERETIC_3_2_3_request("", "Лист5_1!Z35"),
//		T5_CAPEITEM_HERETIC_3_3_3_request("", "Лист5_1!Z36"),
//		T5_CAPEITEM_HERETIC_3_4_3_request("", "Лист5_1!Z37"),
//		
//		T5_CAPEITEM_UNDEAD_1_0_offer("Лист5_1!AD5"),		//Плащ Нежити
//		T5_CAPEITEM_UNDEAD_2_0_offer("Лист5_1!AD6"),		
//		T5_CAPEITEM_UNDEAD_3_0_offer("Лист5_1!AD7"),		
//		T5_CAPEITEM_UNDEAD_4_0_offer("Лист5_1!AD8"),		
//		
//		T5_CAPEITEM_UNDEAD_1_1_1_offer("Лист5_1!AD9"),
//		T5_CAPEITEM_UNDEAD_1_2_1_offer("Лист5_1!AD10"),
//		T5_CAPEITEM_UNDEAD_1_3_1_offer("Лист5_1!AD11"),
//		T5_CAPEITEM_UNDEAD_1_4_1_offer("Лист5_1!AD12"),
//		
//		T5_CAPEITEM_UNDEAD_2_1_2_offer("Лист5_1!AD13"),
//		T5_CAPEITEM_UNDEAD_2_2_2_offer("Лист5_1!AD14"),
//		T5_CAPEITEM_UNDEAD_2_3_2_offer("Лист5_1!AD15"),
//		T5_CAPEITEM_UNDEAD_2_4_2_offer("Лист5_1!AD16"),
//		
//		T5_CAPEITEM_UNDEAD_3_1_3_offer("Лист5_1!AD17"),
//		T5_CAPEITEM_UNDEAD_3_2_3_offer("Лист5_1!AD18"),
//		T5_CAPEITEM_UNDEAD_3_3_3_offer("Лист5_1!AD19"),
//		T5_CAPEITEM_UNDEAD_3_4_3_offer("Лист5_1!AD20"),
//		
//		T5_CAPEITEM_UNDEAD_1_0_request("", "Лист5_1!AD22"),		
//		T5_CAPEITEM_UNDEAD_2_0_request("", "Лист5_1!AD23"),		
//		T5_CAPEITEM_UNDEAD_3_0_request("", "Лист5_1!AD24"),		
//		T5_CAPEITEM_UNDEAD_4_0_request("", "Лист5_1!AD25"),		
//		
//		T5_CAPEITEM_UNDEAD_1_1_1_request("", "Лист5_1!AD26"),
//		T5_CAPEITEM_UNDEAD_1_2_1_request("", "Лист5_1!AD27"),
//		T5_CAPEITEM_UNDEAD_1_3_1_request("", "Лист5_1!AD28"),
//		T5_CAPEITEM_UNDEAD_1_4_1_request("", "Лист5_1!AD29"),
//		
//		T5_CAPEITEM_UNDEAD_2_1_2_request("", "Лист5_1!AD30"),
//		T5_CAPEITEM_UNDEAD_2_2_2_request("", "Лист5_1!AD31"),
//		T5_CAPEITEM_UNDEAD_2_3_2_request("", "Лист5_1!AD32"),
//		T5_CAPEITEM_UNDEAD_2_4_2_request("", "Лист5_1!AD33"),
//		
//		T5_CAPEITEM_UNDEAD_3_1_3_request("", "Лист5_1!AD34"),
//		T5_CAPEITEM_UNDEAD_3_2_3_request("", "Лист5_1!AD35"),
//		T5_CAPEITEM_UNDEAD_3_3_3_request("", "Лист5_1!AD36"),
//		T5_CAPEITEM_UNDEAD_3_4_3_request("", "Лист5_1!AD37"),
//		
//		T5_CAPEITEM_KEEPER_1_0_offer("Лист5_1!AH5"),		//Плащ Хранителей
//		T5_CAPEITEM_KEEPER_2_0_offer("Лист5_1!AH6"),		
//		T5_CAPEITEM_KEEPER_3_0_offer("Лист5_1!AH7"),		
//		T5_CAPEITEM_KEEPER_4_0_offer("Лист5_1!AH8"),		
//		
//		T5_CAPEITEM_KEEPER_1_1_1_offer("Лист5_1!AH9"),
//		T5_CAPEITEM_KEEPER_1_2_1_offer("Лист5_1!AH10"),
//		T5_CAPEITEM_KEEPER_1_3_1_offer("Лист5_1!AH11"),
//		T5_CAPEITEM_KEEPER_1_4_1_offer("Лист5_1!AH12"),
//		
//		T5_CAPEITEM_KEEPER_2_1_2_offer("Лист5_1!AH13"),
//		T5_CAPEITEM_KEEPER_2_2_2_offer("Лист5_1!AH14"),
//		T5_CAPEITEM_KEEPER_2_3_2_offer("Лист5_1!AH15"),
//		T5_CAPEITEM_KEEPER_2_4_2_offer("Лист5_1!AH16"),
//		
//		T5_CAPEITEM_KEEPER_3_1_3_offer("Лист5_1!AH17"),
//		T5_CAPEITEM_KEEPER_3_2_3_offer("Лист5_1!AH18"),
//		T5_CAPEITEM_KEEPER_3_3_3_offer("Лист5_1!AH19"),
//		T5_CAPEITEM_KEEPER_3_4_3_offer("Лист5_1!AH20"),
//		
//		T5_CAPEITEM_KEEPER_1_0_request("", "Лист5_1!AH22"),		
//		T5_CAPEITEM_KEEPER_2_0_request("", "Лист5_1!AH23"),		
//		T5_CAPEITEM_KEEPER_3_0_request("", "Лист5_1!AH24"),		
//		T5_CAPEITEM_KEEPER_4_0_request("", "Лист5_1!AH25"),		
//		
//		T5_CAPEITEM_KEEPER_1_1_1_request("", "Лист5_1!AH26"),
//		T5_CAPEITEM_KEEPER_1_2_1_request("", "Лист5_1!AH27"),
//		T5_CAPEITEM_KEEPER_1_3_1_request("", "Лист5_1!AH28"),
//		T5_CAPEITEM_KEEPER_1_4_1_request("", "Лист5_1!AH29"),
//		
//		T5_CAPEITEM_KEEPER_2_1_2_request("", "Лист5_1!AH30"),
//		T5_CAPEITEM_KEEPER_2_2_2_request("", "Лист5_1!AH31"),
//		T5_CAPEITEM_KEEPER_2_3_2_request("", "Лист5_1!AH32"),
//		T5_CAPEITEM_KEEPER_2_4_2_request("", "Лист5_1!AH33"),
//		
//		T5_CAPEITEM_KEEPER_3_1_3_request("", "Лист5_1!AH34"),
//		T5_CAPEITEM_KEEPER_3_2_3_request("", "Лист5_1!AH35"),
//		T5_CAPEITEM_KEEPER_3_3_3_request("", "Лист5_1!AH36"),
//		T5_CAPEITEM_KEEPER_3_4_3_request("", "Лист5_1!AH37"),
//		
//		T5_CAPEITEM_MORGANA_1_0_offer("Лист5_1!AL5"),		//Плащ морганы
//		T5_CAPEITEM_MORGANA_2_0_offer("Лист5_1!AL6"),		
//		T5_CAPEITEM_MORGANA_3_0_offer("Лист5_1!AL7"),		
//		T5_CAPEITEM_MORGANA_4_0_offer("Лист5_1!AL8"),		
//		
//		T5_CAPEITEM_MORGANA_1_1_1_offer("Лист5_1!AL9"),
//		T5_CAPEITEM_MORGANA_1_2_1_offer("Лист5_1!AL10"),
//		T5_CAPEITEM_MORGANA_1_3_1_offer("Лист5_1!AL11"),
//		T5_CAPEITEM_MORGANA_1_4_1_offer("Лист5_1!AL12"),
//		
//		T5_CAPEITEM_MORGANA_2_1_2_offer("Лист5_1!AL13"),
//		T5_CAPEITEM_MORGANA_2_2_2_offer("Лист5_1!AL14"),
//		T5_CAPEITEM_MORGANA_2_3_2_offer("Лист5_1!AL15"),
//		T5_CAPEITEM_MORGANA_2_4_2_offer("Лист5_1!AL16"),
//		
//		T5_CAPEITEM_MORGANA_3_1_3_offer("Лист5_1!AL17"),
//		T5_CAPEITEM_MORGANA_3_2_3_offer("Лист5_1!AL18"),
//		T5_CAPEITEM_MORGANA_3_3_3_offer("Лист5_1!AL19"),
//		T5_CAPEITEM_MORGANA_3_4_3_offer("Лист5_1!AL20"),
//		
//		T5_CAPEITEM_MORGANA_1_0_request("", "Лист5_1!AL22"),		
//		T5_CAPEITEM_MORGANA_2_0_request("", "Лист5_1!AL23"),		
//		T5_CAPEITEM_MORGANA_3_0_request("", "Лист5_1!AL24"),		
//		T5_CAPEITEM_MORGANA_4_0_request("", "Лист5_1!AL25"),		
//		
//		T5_CAPEITEM_MORGANA_1_1_1_request("", "Лист5_1!AL26"),
//		T5_CAPEITEM_MORGANA_1_2_1_request("", "Лист5_1!AL27"),
//		T5_CAPEITEM_MORGANA_1_3_1_request("", "Лист5_1!AL28"),
//		T5_CAPEITEM_MORGANA_1_4_1_request("", "Лист5_1!AL29"),
//		
//		T5_CAPEITEM_MORGANA_2_1_2_request("", "Лист5_1!AL30"),
//		T5_CAPEITEM_MORGANA_2_2_2_request("", "Лист5_1!AL31"),
//		T5_CAPEITEM_MORGANA_2_3_2_request("", "Лист5_1!AL32"),
//		T5_CAPEITEM_MORGANA_2_4_2_request("", "Лист5_1!AL33"),
//		
//		T5_CAPEITEM_MORGANA_3_1_3_request("", "Лист5_1!AL34"),
//		T5_CAPEITEM_MORGANA_3_2_3_request("", "Лист5_1!AL35"),
//		T5_CAPEITEM_MORGANA_3_3_3_request("", "Лист5_1!AL36"),
//		T5_CAPEITEM_MORGANA_3_4_3_request("", "Лист5_1!AL37"),
//		
//		T5_CAPEITEM_DEMON_1_0_offer("Лист5_1!AP5"),		//Плащ демонов
//		T5_CAPEITEM_DEMON_2_0_offer("Лист5_1!AP6"),		
//		T5_CAPEITEM_DEMON_3_0_offer("Лист5_1!AP7"),		
//		T5_CAPEITEM_DEMON_4_0_offer("Лист5_1!AP8"),		
//		
//		T5_CAPEITEM_DEMON_1_1_1_offer("Лист5_1!AP9"),
//		T5_CAPEITEM_DEMON_1_2_1_offer("Лист5_1!AP10"),
//		T5_CAPEITEM_DEMON_1_3_1_offer("Лист5_1!AP11"),
//		T5_CAPEITEM_DEMON_1_4_1_offer("Лист5_1!AP12"),
//		
//		T5_CAPEITEM_DEMON_2_1_2_offer("Лист5_1!AP13"),
//		T5_CAPEITEM_DEMON_2_2_2_offer("Лист5_1!AP14"),
//		T5_CAPEITEM_DEMON_2_3_2_offer("Лист5_1!AP15"),
//		T5_CAPEITEM_DEMON_2_4_2_offer("Лист5_1!AP16"),
//		
//		T5_CAPEITEM_DEMON_3_1_3_offer("Лист5_1!AP17"),
//		T5_CAPEITEM_DEMON_3_2_3_offer("Лист5_1!AP18"),
//		T5_CAPEITEM_DEMON_3_3_3_offer("Лист5_1!AP19"),
//		T5_CAPEITEM_DEMON_3_4_3_offer("Лист5_1!AP20"),
//		
//		T5_CAPEITEM_DEMON_1_0_request("", "Лист5_1!AP22"),		
//		T5_CAPEITEM_DEMON_2_0_request("", "Лист5_1!AP23"),		
//		T5_CAPEITEM_DEMON_3_0_request("", "Лист5_1!AP24"),		
//		T5_CAPEITEM_DEMON_4_0_request("", "Лист5_1!AP25"),		
//		
//		T5_CAPEITEM_DEMON_1_1_1_request("", "Лист5_1!AP26"),
//		T5_CAPEITEM_DEMON_1_2_1_request("", "Лист5_1!AP27"),
//		T5_CAPEITEM_DEMON_1_3_1_request("", "Лист5_1!AP28"),
//		T5_CAPEITEM_DEMON_1_4_1_request("", "Лист5_1!AP29"),
//		
//		T5_CAPEITEM_DEMON_2_1_2_request("", "Лист5_1!AP30"),
//		T5_CAPEITEM_DEMON_2_2_2_request("", "Лист5_1!AP31"),
//		T5_CAPEITEM_DEMON_2_3_2_request("", "Лист5_1!AP32"),
//		T5_CAPEITEM_DEMON_2_4_2_request("", "Лист5_1!AP33"),
//		
//		T5_CAPEITEM_DEMON_3_1_3_request("", "Лист5_1!AP34"),
//		T5_CAPEITEM_DEMON_3_2_3_request("", "Лист5_1!AP35"),
//		T5_CAPEITEM_DEMON_3_3_3_request("", "Лист5_1!AP36"),
//		T5_CAPEITEM_DEMON_3_4_3_request("", "Лист5_1!AP37"),
//		
//		
//		T5_CAPEITEM_FW_BRECILIEN_1_0_offer("Лист5_1!AT5"),		//Плащ города brecilien
//		T5_CAPEITEM_FW_BRECILIEN_2_0_offer("Лист5_1!AT6"),		
//		T5_CAPEITEM_FW_BRECILIEN_3_0_offer("Лист5_1!AT7"),		
//		T5_CAPEITEM_FW_BRECILIEN_4_0_offer("Лист5_1!AT8"),		
//		
//		T5_CAPEITEM_FW_BRECILIEN_1_1_1_offer("Лист5_1!AT9"),
//		T5_CAPEITEM_FW_BRECILIEN_1_2_1_offer("Лист5_1!AT10"),
//		T5_CAPEITEM_FW_BRECILIEN_1_3_1_offer("Лист5_1!AT11"),
//		T5_CAPEITEM_FW_BRECILIEN_1_4_1_offer("Лист5_1!AT12"),
//		
//		T5_CAPEITEM_FW_BRECILIEN_2_1_2_offer("Лист5_1!AT13"),
//		T5_CAPEITEM_FW_BRECILIEN_2_2_2_offer("Лист5_1!AT14"),
//		T5_CAPEITEM_FW_BRECILIEN_2_3_2_offer("Лист5_1!AT15"),
//		T5_CAPEITEM_FW_BRECILIEN_2_4_2_offer("Лист5_1!AT16"),
//		
//		T5_CAPEITEM_FW_BRECILIEN_3_1_3_offer("Лист5_1!AT17"),
//		T5_CAPEITEM_FW_BRECILIEN_3_2_3_offer("Лист5_1!AT18"),
//		T5_CAPEITEM_FW_BRECILIEN_3_3_3_offer("Лист5_1!AT19"),
//		T5_CAPEITEM_FW_BRECILIEN_3_4_3_offer("Лист5_1!AT20"),
//		
//		T5_CAPEITEM_FW_BRECILIEN_1_0_request("", "Лист5_1!AT22"),		
//		T5_CAPEITEM_FW_BRECILIEN_2_0_request("", "Лист5_1!AT23"),		
//		T5_CAPEITEM_FW_BRECILIEN_3_0_request("", "Лист5_1!AT24"),		
//		T5_CAPEITEM_FW_BRECILIEN_4_0_request("", "Лист5_1!AT25"),		
//		
//		T5_CAPEITEM_FW_BRECILIEN_1_1_1_request("", "Лист5_1!AT26"),
//		T5_CAPEITEM_FW_BRECILIEN_1_2_1_request("", "Лист5_1!AT27"),
//		T5_CAPEITEM_FW_BRECILIEN_1_3_1_request("", "Лист5_1!AT28"),
//		T5_CAPEITEM_FW_BRECILIEN_1_4_1_request("", "Лист5_1!AT29"),
//		
//		T5_CAPEITEM_FW_BRECILIEN_2_1_2_request("", "Лист5_1!AT30"),
//		T5_CAPEITEM_FW_BRECILIEN_2_2_2_request("", "Лист5_1!AT31"),
//		T5_CAPEITEM_FW_BRECILIEN_2_3_2_request("", "Лист5_1!AT32"),
//		T5_CAPEITEM_FW_BRECILIEN_2_4_2_request("", "Лист5_1!AT33"),
//		
//		T5_CAPEITEM_FW_BRECILIEN_3_1_3_request("", "Лист5_1!AT34"),
//		T5_CAPEITEM_FW_BRECILIEN_3_2_3_request("", "Лист5_1!AT35"),
//		T5_CAPEITEM_FW_BRECILIEN_3_3_3_request("", "Лист5_1!AT36"),
//		T5_CAPEITEM_FW_BRECILIEN_3_4_3_request("", "Лист5_1!AT37"),
//		
//		T5_CAPEITEM_AVALON_1_0_offer("Лист5_1!AX5"),		//Авалонский плащ
//		T5_CAPEITEM_AVALON_2_0_offer("Лист5_1!AX6"),		
//		T5_CAPEITEM_AVALON_3_0_offer("Лист5_1!AX7"),		
//		T5_CAPEITEM_AVALON_4_0_offer("Лист5_1!AX8"),		
//		
//		T5_CAPEITEM_AVALON_1_1_1_offer("Лист5_1!AX9"),
//		T5_CAPEITEM_AVALON_1_2_1_offer("Лист5_1!AX10"),
//		T5_CAPEITEM_AVALON_1_3_1_offer("Лист5_1!AX11"),
//		T5_CAPEITEM_AVALON_1_4_1_offer("Лист5_1!AX12"),
//		
//		T5_CAPEITEM_AVALON_2_1_2_offer("Лист5_1!AX13"),
//		T5_CAPEITEM_AVALON_2_2_2_offer("Лист5_1!AX14"),
//		T5_CAPEITEM_AVALON_2_3_2_offer("Лист5_1!AX15"),
//		T5_CAPEITEM_AVALON_2_4_2_offer("Лист5_1!AX16"),
//		
//		T5_CAPEITEM_AVALON_3_1_3_offer("Лист5_1!AX17"),
//		T5_CAPEITEM_AVALON_3_2_3_offer("Лист5_1!AX18"),
//		T5_CAPEITEM_AVALON_3_3_3_offer("Лист5_1!AX19"),
//		T5_CAPEITEM_AVALON_3_4_3_offer("Лист5_1!AX20"),
//		
//		T5_CAPEITEM_AVALON_1_0_request("", "Лист5_1!AX22"),		
//		T5_CAPEITEM_AVALON_2_0_request("", "Лист5_1!AX23"),		
//		T5_CAPEITEM_AVALON_3_0_request("", "Лист5_1!AX24"),		
//		T5_CAPEITEM_AVALON_4_0_request("", "Лист5_1!AX25"),		
//		
//		T5_CAPEITEM_AVALON_1_1_1_request("", "Лист5_1!AX26"),
//		T5_CAPEITEM_AVALON_1_2_1_request("", "Лист5_1!AX27"),
//		T5_CAPEITEM_AVALON_1_3_1_request("", "Лист5_1!AX28"),
//		T5_CAPEITEM_AVALON_1_4_1_request("", "Лист5_1!AX29"),
//		
//		T5_CAPEITEM_AVALON_2_1_2_request("", "Лист5_1!AX30"),
//		T5_CAPEITEM_AVALON_2_2_2_request("", "Лист5_1!AX31"),
//		T5_CAPEITEM_AVALON_2_3_2_request("", "Лист5_1!AX32"),
//		T5_CAPEITEM_AVALON_2_4_2_request("", "Лист5_1!AX33"),
//		
//		T5_CAPEITEM_AVALON_3_1_3_request("", "Лист5_1!AX34"),
//		T5_CAPEITEM_AVALON_3_2_3_request("", "Лист5_1!AX35"),
//		T5_CAPEITEM_AVALON_3_3_3_request("", "Лист5_1!AX36"),
//		T5_CAPEITEM_AVALON_3_4_3_request("", "Лист5_1!AX37"),
//		
//		T6_CAPEITEM_FW_BRIDGEWATCH_BP_1_0_offer("Лист5_2!B52"), 	//Герб города Bridgewatch
//		T6_CAPEITEM_FW_FORTSTERLING_BP_1_0_offer("Лист5_2!B53"), 	//Герб города Fort
//		T6_CAPEITEM_FW_LYMHURST_BP_1_0_offer("Лист5_2!B54"), 		//Герб города Lymhurst
//		T6_CAPEITEM_FW_MARTLOCK_BP_1_0_offer("Лист5_2!B55"), 		//Герб города Martlock
//		T6_CAPEITEM_FW_THETFORD_BP_1_0_offer("Лист5_2!B56"), 		//Герб города Thetford
//		T6_CAPEITEM_FW_CAERLEON_BP_1_0_offer("Лист5_2!B57"), 		//Герб города Caerleon
//		T6_CAPEITEM_HERETIC_BP_1_0_offer("Лист5_2!B58"), 			//Герб Еретиков
//		T6_CAPEITEM_UNDEAD_BP_1_0_offer("Лист5_2!B59"), 			//Герб Нежити
//		T6_CAPEITEM_KEEPER_BP_1_0_offer("Лист5_2!B60"), 			//Герб Хранителей
//		T6_CAPEITEM_MORGANA_BP_1_0_offer("Лист5_2!B61"), 			//Герб Морганы
//		T6_CAPEITEM_DEMON_BP_1_0_offer("Лист5_2!B62"), 				//Герб Демонов
//		T6_CAPEITEM_FW_BRECILIEN_BP_1_0_offer("Лист5_2!B63"), 		//Герб города Brecilien
//		T6_CAPEITEM_AVALON_BP_1_0_offer("Лист5_2!B64"), 			//Герб Авалона
//		
//		
//		T6_CAPE_1_0_offer("Лист5_2!D40"),	//Плащ Т6
//		T6_CAPE_2_0_offer("Лист5_2!D41"),		
//		T6_CAPE_3_0_offer("Лист5_2!D42"),		
//		T6_CAPE_4_0_offer("Лист5_2!D43"),		
//		
//		T6_CAPE_1_1_1_offer("Лист5_2!D44"),
//		T6_CAPE_1_2_1_offer("Лист5_2!D45"),
//		T6_CAPE_1_3_1_offer("Лист5_2!D46"),
//		T6_CAPE_1_4_1_offer("Лист5_2!D47"),
//		
//		T6_CAPE_2_1_2_offer("Лист5_2!D48"),
//		T6_CAPE_2_2_2_offer("Лист5_2!D49"),
//		T6_CAPE_2_3_2_offer("Лист5_2!D50"),
//		T6_CAPE_2_4_2_offer("Лист5_2!D51"),
//		
//		T6_CAPE_3_1_3_offer("Лист5_2!D52"),
//		T6_CAPE_3_2_3_offer("Лист5_2!D53"),
//		T6_CAPE_3_3_3_offer("Лист5_2!D54"),
//		T6_CAPE_3_4_3_offer("Лист5_2!D55"),
//		
//		T6_RUNE_1_0_offer("Лист5_2!B48"), 	//Руна Т6
//		T6_SOUL_1_0_offer("Лист5_2!B49"), 	//Душа Т6
//		T6_RELIC_1_0_offer("Лист5_2!B50"), 	//Реликт Т6
//		
//		
//		T6_CAPEITEM_FW_BRIDGEWATCH_1_0_offer("Лист5_2!B5"),		//Накидка знатока Bridgewatch
//		T6_CAPEITEM_FW_BRIDGEWATCH_2_0_offer("Лист5_2!B6"),		
//		T6_CAPEITEM_FW_BRIDGEWATCH_3_0_offer("Лист5_2!B7"),		
//		T6_CAPEITEM_FW_BRIDGEWATCH_4_0_offer("Лист5_2!B8"),		
//		
//		T6_CAPEITEM_FW_BRIDGEWATCH_1_1_1_offer("Лист5_2!B9"),
//		T6_CAPEITEM_FW_BRIDGEWATCH_1_2_1_offer("Лист5_2!B10"),
//		T6_CAPEITEM_FW_BRIDGEWATCH_1_3_1_offer("Лист5_2!B11"),
//		T6_CAPEITEM_FW_BRIDGEWATCH_1_4_1_offer("Лист5_2!B12"),
//		
//		T6_CAPEITEM_FW_BRIDGEWATCH_2_1_2_offer("Лист5_2!B13"),
//		T6_CAPEITEM_FW_BRIDGEWATCH_2_2_2_offer("Лист5_2!B14"),
//		T6_CAPEITEM_FW_BRIDGEWATCH_2_3_2_offer("Лист5_2!B15"),
//		T6_CAPEITEM_FW_BRIDGEWATCH_2_4_2_offer("Лист5_2!B16"),
//		
//		T6_CAPEITEM_FW_BRIDGEWATCH_3_1_3_offer("Лист5_2!B17"),
//		T6_CAPEITEM_FW_BRIDGEWATCH_3_2_3_offer("Лист5_2!B18"),
//		T6_CAPEITEM_FW_BRIDGEWATCH_3_3_3_offer("Лист5_2!B19"),
//		T6_CAPEITEM_FW_BRIDGEWATCH_3_4_3_offer("Лист5_2!B20"),
//		
//		T6_CAPEITEM_FW_BRIDGEWATCH_1_0_request("", "Лист5_2!B22"),		
//		T6_CAPEITEM_FW_BRIDGEWATCH_2_0_request("", "Лист5_2!B23"),		
//		T6_CAPEITEM_FW_BRIDGEWATCH_3_0_request("", "Лист5_2!B24"),		
//		T6_CAPEITEM_FW_BRIDGEWATCH_4_0_request("", "Лист5_2!B25"),		
//		
//		T6_CAPEITEM_FW_BRIDGEWATCH_1_1_1_request("", "Лист5_2!B26"),
//		T6_CAPEITEM_FW_BRIDGEWATCH_1_2_1_request("", "Лист5_2!B27"),
//		T6_CAPEITEM_FW_BRIDGEWATCH_1_3_1_request("", "Лист5_2!B28"),
//		T6_CAPEITEM_FW_BRIDGEWATCH_1_4_1_request("", "Лист5_2!B29"),
//		
//		T6_CAPEITEM_FW_BRIDGEWATCH_2_1_2_request("", "Лист5_2!B30"),
//		T6_CAPEITEM_FW_BRIDGEWATCH_2_2_2_request("", "Лист5_2!B31"),
//		T6_CAPEITEM_FW_BRIDGEWATCH_2_3_2_request("", "Лист5_2!B32"),
//		T6_CAPEITEM_FW_BRIDGEWATCH_2_4_2_request("", "Лист5_2!B33"),
//		
//		T6_CAPEITEM_FW_BRIDGEWATCH_3_1_3_request("", "Лист5_2!B34"),
//		T6_CAPEITEM_FW_BRIDGEWATCH_3_2_3_request("", "Лист5_2!B35"),
//		T6_CAPEITEM_FW_BRIDGEWATCH_3_3_3_request("", "Лист5_2!B36"),
//		T6_CAPEITEM_FW_BRIDGEWATCH_3_4_3_request("", "Лист5_2!B37"),
//		
//		
//		T6_CAPEITEM_FW_FORTSTERLING_1_0_offer("Лист5_2!F5"),		//Накидка знатока FortSterling
//		T6_CAPEITEM_FW_FORTSTERLING_2_0_offer("Лист5_2!F6"),		
//		T6_CAPEITEM_FW_FORTSTERLING_3_0_offer("Лист5_2!F7"),		
//		T6_CAPEITEM_FW_FORTSTERLING_4_0_offer("Лист5_2!F8"),		
//		
//		T6_CAPEITEM_FW_FORTSTERLING_1_1_1_offer("Лист5_2!F9"),
//		T6_CAPEITEM_FW_FORTSTERLING_1_2_1_offer("Лист5_2!F10"),
//		T6_CAPEITEM_FW_FORTSTERLING_1_3_1_offer("Лист5_2!F11"),
//		T6_CAPEITEM_FW_FORTSTERLING_1_4_1_offer("Лист5_2!F12"),
//		
//		T6_CAPEITEM_FW_FORTSTERLING_2_1_2_offer("Лист5_2!F13"),
//		T6_CAPEITEM_FW_FORTSTERLING_2_2_2_offer("Лист5_2!F14"),
//		T6_CAPEITEM_FW_FORTSTERLING_2_3_2_offer("Лист5_2!F15"),
//		T6_CAPEITEM_FW_FORTSTERLING_2_4_2_offer("Лист5_2!F16"),
//		
//		T6_CAPEITEM_FW_FORTSTERLING_3_1_3_offer("Лист5_2!F17"),
//		T6_CAPEITEM_FW_FORTSTERLING_3_2_3_offer("Лист5_2!F18"),
//		T6_CAPEITEM_FW_FORTSTERLING_3_3_3_offer("Лист5_2!F19"),
//		T6_CAPEITEM_FW_FORTSTERLING_3_4_3_offer("Лист5_2!F20"),
//		
//		T6_CAPEITEM_FW_FORTSTERLING_1_0_request("", "Лист5_2!F22"),		
//		T6_CAPEITEM_FW_FORTSTERLING_2_0_request("", "Лист5_2!F23"),		
//		T6_CAPEITEM_FW_FORTSTERLING_3_0_request("", "Лист5_2!F24"),		
//		T6_CAPEITEM_FW_FORTSTERLING_4_0_request("", "Лист5_2!F25"),		
//		
//		T6_CAPEITEM_FW_FORTSTERLING_1_1_1_request("", "Лист5_2!F26"),
//		T6_CAPEITEM_FW_FORTSTERLING_1_2_1_request("", "Лист5_2!F27"),
//		T6_CAPEITEM_FW_FORTSTERLING_1_3_1_request("", "Лист5_2!F28"),
//		T6_CAPEITEM_FW_FORTSTERLING_1_4_1_request("", "Лист5_2!F29"),
//		
//		T6_CAPEITEM_FW_FORTSTERLING_2_1_2_request("", "Лист5_2!F30"),
//		T6_CAPEITEM_FW_FORTSTERLING_2_2_2_request("", "Лист5_2!F31"),
//		T6_CAPEITEM_FW_FORTSTERLING_2_3_2_request("", "Лист5_2!F32"),
//		T6_CAPEITEM_FW_FORTSTERLING_2_4_2_request("", "Лист5_2!F33"),
//		
//		T6_CAPEITEM_FW_FORTSTERLING_3_1_3_request("", "Лист5_2!F34"),
//		T6_CAPEITEM_FW_FORTSTERLING_3_2_3_request("", "Лист5_2!F35"),
//		T6_CAPEITEM_FW_FORTSTERLING_3_3_3_request("", "Лист5_2!F36"),
//		T6_CAPEITEM_FW_FORTSTERLING_3_4_3_request("", "Лист5_2!F37"),
//		
//		T6_CAPEITEM_FW_LYMHURST_1_0_offer("Лист5_2!J5"),		//Накидка знатока Lymhurst
//		T6_CAPEITEM_FW_LYMHURST_2_0_offer("Лист5_2!J6"),		
//		T6_CAPEITEM_FW_LYMHURST_3_0_offer("Лист5_2!J7"),		
//		T6_CAPEITEM_FW_LYMHURST_4_0_offer("Лист5_2!J8"),		
//		
//		T6_CAPEITEM_FW_LYMHURST_1_1_1_offer("Лист5_2!J9"),
//		T6_CAPEITEM_FW_LYMHURST_1_2_1_offer("Лист5_2!J10"),
//		T6_CAPEITEM_FW_LYMHURST_1_3_1_offer("Лист5_2!J11"),
//		T6_CAPEITEM_FW_LYMHURST_1_4_1_offer("Лист5_2!J12"),
//		
//		T6_CAPEITEM_FW_LYMHURST_2_1_2_offer("Лист5_2!J13"),
//		T6_CAPEITEM_FW_LYMHURST_2_2_2_offer("Лист5_2!J14"),
//		T6_CAPEITEM_FW_LYMHURST_2_3_2_offer("Лист5_2!J15"),
//		T6_CAPEITEM_FW_LYMHURST_2_4_2_offer("Лист5_2!J16"),
//		
//		T6_CAPEITEM_FW_LYMHURST_3_1_3_offer("Лист5_2!J17"),
//		T6_CAPEITEM_FW_LYMHURST_3_2_3_offer("Лист5_2!J18"),
//		T6_CAPEITEM_FW_LYMHURST_3_3_3_offer("Лист5_2!J19"),
//		T6_CAPEITEM_FW_LYMHURST_3_4_3_offer("Лист5_2!J20"),
//		
//		T6_CAPEITEM_FW_LYMHURST_1_0_request("", "Лист5_2!J22"),		
//		T6_CAPEITEM_FW_LYMHURST_2_0_request("", "Лист5_2!J23"),		
//		T6_CAPEITEM_FW_LYMHURST_3_0_request("", "Лист5_2!J24"),		
//		T6_CAPEITEM_FW_LYMHURST_4_0_request("", "Лист5_2!J25"),		
//		
//		T6_CAPEITEM_FW_LYMHURST_1_1_1_request("", "Лист5_2!J26"),
//		T6_CAPEITEM_FW_LYMHURST_1_2_1_request("", "Лист5_2!J27"),
//		T6_CAPEITEM_FW_LYMHURST_1_3_1_request("", "Лист5_2!J28"),
//		T6_CAPEITEM_FW_LYMHURST_1_4_1_request("", "Лист5_2!J29"),
//		
//		T6_CAPEITEM_FW_LYMHURST_2_1_2_request("", "Лист5_2!J30"),
//		T6_CAPEITEM_FW_LYMHURST_2_2_2_request("", "Лист5_2!J31"),
//		T6_CAPEITEM_FW_LYMHURST_2_3_2_request("", "Лист5_2!J32"),
//		T6_CAPEITEM_FW_LYMHURST_2_4_2_request("", "Лист5_2!J33"),
//		
//		T6_CAPEITEM_FW_LYMHURST_3_1_3_request("", "Лист5_2!J34"),
//		T6_CAPEITEM_FW_LYMHURST_3_2_3_request("", "Лист5_2!J35"),
//		T6_CAPEITEM_FW_LYMHURST_3_3_3_request("", "Лист5_2!J36"),
//		T6_CAPEITEM_FW_LYMHURST_3_4_3_request("", "Лист5_2!J37"),
//		
//		T6_CAPEITEM_FW_MARTLOCK_1_0_offer("Лист5_2!N5"),		//Накидка знатока Martlock
//		T6_CAPEITEM_FW_MARTLOCK_2_0_offer("Лист5_2!N6"),		
//		T6_CAPEITEM_FW_MARTLOCK_3_0_offer("Лист5_2!N7"),		
//		T6_CAPEITEM_FW_MARTLOCK_4_0_offer("Лист5_2!N8"),		
//		
//		T6_CAPEITEM_FW_MARTLOCK_1_1_1_offer("Лист5_2!N9"),
//		T6_CAPEITEM_FW_MARTLOCK_1_2_1_offer("Лист5_2!N10"),
//		T6_CAPEITEM_FW_MARTLOCK_1_3_1_offer("Лист5_2!N11"),
//		T6_CAPEITEM_FW_MARTLOCK_1_4_1_offer("Лист5_2!N12"),
//		
//		T6_CAPEITEM_FW_MARTLOCK_2_1_2_offer("Лист5_2!N13"),
//		T6_CAPEITEM_FW_MARTLOCK_2_2_2_offer("Лист5_2!N14"),
//		T6_CAPEITEM_FW_MARTLOCK_2_3_2_offer("Лист5_2!N15"),
//		T6_CAPEITEM_FW_MARTLOCK_2_4_2_offer("Лист5_2!N16"),
//		
//		T6_CAPEITEM_FW_MARTLOCK_3_1_3_offer("Лист5_2!N17"),
//		T6_CAPEITEM_FW_MARTLOCK_3_2_3_offer("Лист5_2!N18"),
//		T6_CAPEITEM_FW_MARTLOCK_3_3_3_offer("Лист5_2!N19"),
//		T6_CAPEITEM_FW_MARTLOCK_3_4_3_offer("Лист5_2!N20"),
//		
//		T6_CAPEITEM_FW_MARTLOCK_1_0_request("", "Лист5_2!N22"),		
//		T6_CAPEITEM_FW_MARTLOCK_2_0_request("", "Лист5_2!N23"),		
//		T6_CAPEITEM_FW_MARTLOCK_3_0_request("", "Лист5_2!N24"),		
//		T6_CAPEITEM_FW_MARTLOCK_4_0_request("", "Лист5_2!N25"),		
//		
//		T6_CAPEITEM_FW_MARTLOCK_1_1_1_request("", "Лист5_2!N26"),
//		T6_CAPEITEM_FW_MARTLOCK_1_2_1_request("", "Лист5_2!N27"),
//		T6_CAPEITEM_FW_MARTLOCK_1_3_1_request("", "Лист5_2!N28"),
//		T6_CAPEITEM_FW_MARTLOCK_1_4_1_request("", "Лист5_2!N29"),
//		
//		T6_CAPEITEM_FW_MARTLOCK_2_1_2_request("", "Лист5_2!N30"),
//		T6_CAPEITEM_FW_MARTLOCK_2_2_2_request("", "Лист5_2!N31"),
//		T6_CAPEITEM_FW_MARTLOCK_2_3_2_request("", "Лист5_2!N32"),
//		T6_CAPEITEM_FW_MARTLOCK_2_4_2_request("", "Лист5_2!N33"),
//		
//		T6_CAPEITEM_FW_MARTLOCK_3_1_3_request("", "Лист5_2!N34"),
//		T6_CAPEITEM_FW_MARTLOCK_3_2_3_request("", "Лист5_2!N35"),
//		T6_CAPEITEM_FW_MARTLOCK_3_3_3_request("", "Лист5_2!N36"),
//		T6_CAPEITEM_FW_MARTLOCK_3_4_3_request("", "Лист5_2!N37"),
//		
//		T6_CAPEITEM_FW_THETFORD_1_0_offer("Лист5_2!R5"),		//Накидка знатока Therford
//		T6_CAPEITEM_FW_THETFORD_2_0_offer("Лист5_2!R6"),		
//		T6_CAPEITEM_FW_THETFORD_3_0_offer("Лист5_2!R7"),		
//		T6_CAPEITEM_FW_THETFORD_4_0_offer("Лист5_2!R8"),		
//		
//		T6_CAPEITEM_FW_THETFORD_1_1_1_offer("Лист5_2!R9"),
//		T6_CAPEITEM_FW_THETFORD_1_2_1_offer("Лист5_2!R10"),
//		T6_CAPEITEM_FW_THETFORD_1_3_1_offer("Лист5_2!R11"),
//		T6_CAPEITEM_FW_THETFORD_1_4_1_offer("Лист5_2!R12"),
//		
//		T6_CAPEITEM_FW_THETFORD_2_1_2_offer("Лист5_2!R13"),
//		T6_CAPEITEM_FW_THETFORD_2_2_2_offer("Лист5_2!R14"),
//		T6_CAPEITEM_FW_THETFORD_2_3_2_offer("Лист5_2!R15"),
//		T6_CAPEITEM_FW_THETFORD_2_4_2_offer("Лист5_2!R16"),
//		
//		T6_CAPEITEM_FW_THETFORD_3_1_3_offer("Лист5_2!R17"),
//		T6_CAPEITEM_FW_THETFORD_3_2_3_offer("Лист5_2!R18"),
//		T6_CAPEITEM_FW_THETFORD_3_3_3_offer("Лист5_2!R19"),
//		T6_CAPEITEM_FW_THETFORD_3_4_3_offer("Лист5_2!R20"),
//		
//		T6_CAPEITEM_FW_THETFORD_1_0_request("", "Лист5_2!R22"),		
//		T6_CAPEITEM_FW_THETFORD_2_0_request("", "Лист5_2!R23"),		
//		T6_CAPEITEM_FW_THETFORD_3_0_request("", "Лист5_2!R24"),		
//		T6_CAPEITEM_FW_THETFORD_4_0_request("", "Лист5_2!R25"),		
//		
//		T6_CAPEITEM_FW_THETFORD_1_1_1_request("", "Лист5_2!R26"),
//		T6_CAPEITEM_FW_THETFORD_1_2_1_request("", "Лист5_2!R27"),
//		T6_CAPEITEM_FW_THETFORD_1_3_1_request("", "Лист5_2!R28"),
//		T6_CAPEITEM_FW_THETFORD_1_4_1_request("", "Лист5_2!R29"),
//		
//		T6_CAPEITEM_FW_THETFORD_2_1_2_request("", "Лист5_2!R30"),
//		T6_CAPEITEM_FW_THETFORD_2_2_2_request("", "Лист5_2!R31"),
//		T6_CAPEITEM_FW_THETFORD_2_3_2_request("", "Лист5_2!R32"),
//		T6_CAPEITEM_FW_THETFORD_2_4_2_request("", "Лист5_2!R33"),
//		
//		T6_CAPEITEM_FW_THETFORD_3_1_3_request("", "Лист5_2!R34"),
//		T6_CAPEITEM_FW_THETFORD_3_2_3_request("", "Лист5_2!R35"),
//		T6_CAPEITEM_FW_THETFORD_3_3_3_request("", "Лист5_2!R36"),
//		T6_CAPEITEM_FW_THETFORD_3_4_3_request("", "Лист5_2!R37"),
//		
//		T6_CAPEITEM_FW_CAERLEON_1_0_offer("Лист5_2!V5"),		//Плащ города Caerleon
//		T6_CAPEITEM_FW_CAERLEON_2_0_offer("Лист5_2!V6"),		
//		T6_CAPEITEM_FW_CAERLEON_3_0_offer("Лист5_2!V7"),		
//		T6_CAPEITEM_FW_CAERLEON_4_0_offer("Лист5_2!V8"),		
//		
//		T6_CAPEITEM_FW_CAERLEON_1_1_1_offer("Лист5_2!V9"),
//		T6_CAPEITEM_FW_CAERLEON_1_2_1_offer("Лист5_2!V10"),
//		T6_CAPEITEM_FW_CAERLEON_1_3_1_offer("Лист5_2!V11"),
//		T6_CAPEITEM_FW_CAERLEON_1_4_1_offer("Лист5_2!V12"),
//		
//		T6_CAPEITEM_FW_CAERLEON_2_1_2_offer("Лист5_2!V13"),
//		T6_CAPEITEM_FW_CAERLEON_2_2_2_offer("Лист5_2!V14"),
//		T6_CAPEITEM_FW_CAERLEON_2_3_2_offer("Лист5_2!V15"),
//		T6_CAPEITEM_FW_CAERLEON_2_4_2_offer("Лист5_2!V16"),
//		
//		T6_CAPEITEM_FW_CAERLEON_3_1_3_offer("Лист5_2!V17"),
//		T6_CAPEITEM_FW_CAERLEON_3_2_3_offer("Лист5_2!V18"),
//		T6_CAPEITEM_FW_CAERLEON_3_3_3_offer("Лист5_2!V19"),
//		T6_CAPEITEM_FW_CAERLEON_3_4_3_offer("Лист5_2!V20"),
//		
//		T6_CAPEITEM_FW_CAERLEON_1_0_request("", "Лист5_2!V22"),		
//		T6_CAPEITEM_FW_CAERLEON_2_0_request("", "Лист5_2!V23"),		
//		T6_CAPEITEM_FW_CAERLEON_3_0_request("", "Лист5_2!V24"),		
//		T6_CAPEITEM_FW_CAERLEON_4_0_request("", "Лист5_2!V25"),		
//		
//		T6_CAPEITEM_FW_CAERLEON_1_1_1_request("", "Лист5_2!V26"),
//		T6_CAPEITEM_FW_CAERLEON_1_2_1_request("", "Лист5_2!V27"),
//		T6_CAPEITEM_FW_CAERLEON_1_3_1_request("", "Лист5_2!V28"),
//		T6_CAPEITEM_FW_CAERLEON_1_4_1_request("", "Лист5_2!V29"),
//		
//		T6_CAPEITEM_FW_CAERLEON_2_1_2_request("", "Лист5_2!V30"),
//		T6_CAPEITEM_FW_CAERLEON_2_2_2_request("", "Лист5_2!V31"),
//		T6_CAPEITEM_FW_CAERLEON_2_3_2_request("", "Лист5_2!V32"),
//		T6_CAPEITEM_FW_CAERLEON_2_4_2_request("", "Лист5_2!V33"),
//		
//		T6_CAPEITEM_FW_CAERLEON_3_1_3_request("", "Лист5_2!V34"),
//		T6_CAPEITEM_FW_CAERLEON_3_2_3_request("", "Лист5_2!V35"),
//		T6_CAPEITEM_FW_CAERLEON_3_3_3_request("", "Лист5_2!V36"),
//		T6_CAPEITEM_FW_CAERLEON_3_4_3_request("", "Лист5_2!V37"),
//		
//		T6_CAPEITEM_HERETIC_1_0_offer("Лист5_2!Z5"),		//Плащ еретиков
//		T6_CAPEITEM_HERETIC_2_0_offer("Лист5_2!Z6"),		
//		T6_CAPEITEM_HERETIC_3_0_offer("Лист5_2!Z7"),		
//		T6_CAPEITEM_HERETIC_4_0_offer("Лист5_2!Z8"),		
//		
//		T6_CAPEITEM_HERETIC_1_1_1_offer("Лист5_2!Z9"),
//		T6_CAPEITEM_HERETIC_1_2_1_offer("Лист5_2!Z10"),
//		T6_CAPEITEM_HERETIC_1_3_1_offer("Лист5_2!Z11"),
//		T6_CAPEITEM_HERETIC_1_4_1_offer("Лист5_2!Z12"),
//		
//		T6_CAPEITEM_HERETIC_2_1_2_offer("Лист5_2!Z13"),
//		T6_CAPEITEM_HERETIC_2_2_2_offer("Лист5_2!Z14"),
//		T6_CAPEITEM_HERETIC_2_3_2_offer("Лист5_2!Z15"),
//		T6_CAPEITEM_HERETIC_2_4_2_offer("Лист5_2!Z16"),
//		
//		T6_CAPEITEM_HERETIC_3_1_3_offer("Лист5_2!Z17"),
//		T6_CAPEITEM_HERETIC_3_2_3_offer("Лист5_2!Z18"),
//		T6_CAPEITEM_HERETIC_3_3_3_offer("Лист5_2!Z19"),
//		T6_CAPEITEM_HERETIC_3_4_3_offer("Лист5_2!Z20"),
//		
//		T6_CAPEITEM_HERETIC_1_0_request("", "Лист5_2!Z22"),		
//		T6_CAPEITEM_HERETIC_2_0_request("", "Лист5_2!Z23"),		
//		T6_CAPEITEM_HERETIC_3_0_request("", "Лист5_2!Z24"),		
//		T6_CAPEITEM_HERETIC_4_0_request("", "Лист5_2!Z25"),		
//		
//		T6_CAPEITEM_HERETIC_1_1_1_request("", "Лист5_2!Z26"),
//		T6_CAPEITEM_HERETIC_1_2_1_request("", "Лист5_2!Z27"),
//		T6_CAPEITEM_HERETIC_1_3_1_request("", "Лист5_2!Z28"),
//		T6_CAPEITEM_HERETIC_1_4_1_request("", "Лист5_2!Z29"),
//		
//		T6_CAPEITEM_HERETIC_2_1_2_request("", "Лист5_2!Z30"),
//		T6_CAPEITEM_HERETIC_2_2_2_request("", "Лист5_2!Z31"),
//		T6_CAPEITEM_HERETIC_2_3_2_request("", "Лист5_2!Z32"),
//		T6_CAPEITEM_HERETIC_2_4_2_request("", "Лист5_2!Z33"),
//		
//		T6_CAPEITEM_HERETIC_3_1_3_request("", "Лист5_2!Z34"),
//		T6_CAPEITEM_HERETIC_3_2_3_request("", "Лист5_2!Z35"),
//		T6_CAPEITEM_HERETIC_3_3_3_request("", "Лист5_2!Z36"),
//		T6_CAPEITEM_HERETIC_3_4_3_request("", "Лист5_2!Z37"),
//		
//		T6_CAPEITEM_UNDEAD_1_0_offer("Лист5_2!AD5"),		//Плащ Нежити
//		T6_CAPEITEM_UNDEAD_2_0_offer("Лист5_2!AD6"),		
//		T6_CAPEITEM_UNDEAD_3_0_offer("Лист5_2!AD7"),		
//		T6_CAPEITEM_UNDEAD_4_0_offer("Лист5_2!AD8"),		
//		
//		T6_CAPEITEM_UNDEAD_1_1_1_offer("Лист5_2!AD9"),
//		T6_CAPEITEM_UNDEAD_1_2_1_offer("Лист5_2!AD10"),
//		T6_CAPEITEM_UNDEAD_1_3_1_offer("Лист5_2!AD11"),
//		T6_CAPEITEM_UNDEAD_1_4_1_offer("Лист5_2!AD12"),
//		
//		T6_CAPEITEM_UNDEAD_2_1_2_offer("Лист5_2!AD13"),
//		T6_CAPEITEM_UNDEAD_2_2_2_offer("Лист5_2!AD14"),
//		T6_CAPEITEM_UNDEAD_2_3_2_offer("Лист5_2!AD15"),
//		T6_CAPEITEM_UNDEAD_2_4_2_offer("Лист5_2!AD16"),
//		
//		T6_CAPEITEM_UNDEAD_3_1_3_offer("Лист5_2!AD17"),
//		T6_CAPEITEM_UNDEAD_3_2_3_offer("Лист5_2!AD18"),
//		T6_CAPEITEM_UNDEAD_3_3_3_offer("Лист5_2!AD19"),
//		T6_CAPEITEM_UNDEAD_3_4_3_offer("Лист5_2!AD20"),
//		
//		T6_CAPEITEM_UNDEAD_1_0_request("", "Лист5_2!AD22"),		
//		T6_CAPEITEM_UNDEAD_2_0_request("", "Лист5_2!AD23"),		
//		T6_CAPEITEM_UNDEAD_3_0_request("", "Лист5_2!AD24"),		
//		T6_CAPEITEM_UNDEAD_4_0_request("", "Лист5_2!AD25"),		
//		
//		T6_CAPEITEM_UNDEAD_1_1_1_request("", "Лист5_2!AD26"),
//		T6_CAPEITEM_UNDEAD_1_2_1_request("", "Лист5_2!AD27"),
//		T6_CAPEITEM_UNDEAD_1_3_1_request("", "Лист5_2!AD28"),
//		T6_CAPEITEM_UNDEAD_1_4_1_request("", "Лист5_2!AD29"),
//		
//		T6_CAPEITEM_UNDEAD_2_1_2_request("", "Лист5_2!AD30"),
//		T6_CAPEITEM_UNDEAD_2_2_2_request("", "Лист5_2!AD31"),
//		T6_CAPEITEM_UNDEAD_2_3_2_request("", "Лист5_2!AD32"),
//		T6_CAPEITEM_UNDEAD_2_4_2_request("", "Лист5_2!AD33"),
//		
//		T6_CAPEITEM_UNDEAD_3_1_3_request("", "Лист5_2!AD34"),
//		T6_CAPEITEM_UNDEAD_3_2_3_request("", "Лист5_2!AD35"),
//		T6_CAPEITEM_UNDEAD_3_3_3_request("", "Лист5_2!AD36"),
//		T6_CAPEITEM_UNDEAD_3_4_3_request("", "Лист5_2!AD37"),
//		
//		T6_CAPEITEM_KEEPER_1_0_offer("Лист5_2!AH5"),		//Плащ Хранителей
//		T6_CAPEITEM_KEEPER_2_0_offer("Лист5_2!AH6"),		
//		T6_CAPEITEM_KEEPER_3_0_offer("Лист5_2!AH7"),		
//		T6_CAPEITEM_KEEPER_4_0_offer("Лист5_2!AH8"),		
//		
//		T6_CAPEITEM_KEEPER_1_1_1_offer("Лист5_2!AH9"),
//		T6_CAPEITEM_KEEPER_1_2_1_offer("Лист5_2!AH10"),
//		T6_CAPEITEM_KEEPER_1_3_1_offer("Лист5_2!AH11"),
//		T6_CAPEITEM_KEEPER_1_4_1_offer("Лист5_2!AH12"),
//		
//		T6_CAPEITEM_KEEPER_2_1_2_offer("Лист5_2!AH13"),
//		T6_CAPEITEM_KEEPER_2_2_2_offer("Лист5_2!AH14"),
//		T6_CAPEITEM_KEEPER_2_3_2_offer("Лист5_2!AH15"),
//		T6_CAPEITEM_KEEPER_2_4_2_offer("Лист5_2!AH16"),
//		
//		T6_CAPEITEM_KEEPER_3_1_3_offer("Лист5_2!AH17"),
//		T6_CAPEITEM_KEEPER_3_2_3_offer("Лист5_2!AH18"),
//		T6_CAPEITEM_KEEPER_3_3_3_offer("Лист5_2!AH19"),
//		T6_CAPEITEM_KEEPER_3_4_3_offer("Лист5_2!AH20"),
//		
//		T6_CAPEITEM_KEEPER_1_0_request("", "Лист5_2!AH22"),		
//		T6_CAPEITEM_KEEPER_2_0_request("", "Лист5_2!AH23"),		
//		T6_CAPEITEM_KEEPER_3_0_request("", "Лист5_2!AH24"),		
//		T6_CAPEITEM_KEEPER_4_0_request("", "Лист5_2!AH25"),		
//		
//		T6_CAPEITEM_KEEPER_1_1_1_request("", "Лист5_2!AH26"),
//		T6_CAPEITEM_KEEPER_1_2_1_request("", "Лист5_2!AH27"),
//		T6_CAPEITEM_KEEPER_1_3_1_request("", "Лист5_2!AH28"),
//		T6_CAPEITEM_KEEPER_1_4_1_request("", "Лист5_2!AH29"),
//		
//		T6_CAPEITEM_KEEPER_2_1_2_request("", "Лист5_2!AH30"),
//		T6_CAPEITEM_KEEPER_2_2_2_request("", "Лист5_2!AH31"),
//		T6_CAPEITEM_KEEPER_2_3_2_request("", "Лист5_2!AH32"),
//		T6_CAPEITEM_KEEPER_2_4_2_request("", "Лист5_2!AH33"),
//		
//		T6_CAPEITEM_KEEPER_3_1_3_request("", "Лист5_2!AH34"),
//		T6_CAPEITEM_KEEPER_3_2_3_request("", "Лист5_2!AH35"),
//		T6_CAPEITEM_KEEPER_3_3_3_request("", "Лист5_2!AH36"),
//		T6_CAPEITEM_KEEPER_3_4_3_request("", "Лист5_2!AH37"),
//		
//		T6_CAPEITEM_MORGANA_1_0_offer("Лист5_2!AL5"),		//Плащ морганы
//		T6_CAPEITEM_MORGANA_2_0_offer("Лист5_2!AL6"),		
//		T6_CAPEITEM_MORGANA_3_0_offer("Лист5_2!AL7"),		
//		T6_CAPEITEM_MORGANA_4_0_offer("Лист5_2!AL8"),		
//		
//		T6_CAPEITEM_MORGANA_1_1_1_offer("Лист5_2!AL9"),
//		T6_CAPEITEM_MORGANA_1_2_1_offer("Лист5_2!AL10"),
//		T6_CAPEITEM_MORGANA_1_3_1_offer("Лист5_2!AL11"),
//		T6_CAPEITEM_MORGANA_1_4_1_offer("Лист5_2!AL12"),
//		
//		T6_CAPEITEM_MORGANA_2_1_2_offer("Лист5_2!AL13"),
//		T6_CAPEITEM_MORGANA_2_2_2_offer("Лист5_2!AL14"),
//		T6_CAPEITEM_MORGANA_2_3_2_offer("Лист5_2!AL15"),
//		T6_CAPEITEM_MORGANA_2_4_2_offer("Лист5_2!AL16"),
//		
//		T6_CAPEITEM_MORGANA_3_1_3_offer("Лист5_2!AL17"),
//		T6_CAPEITEM_MORGANA_3_2_3_offer("Лист5_2!AL18"),
//		T6_CAPEITEM_MORGANA_3_3_3_offer("Лист5_2!AL19"),
//		T6_CAPEITEM_MORGANA_3_4_3_offer("Лист5_2!AL20"),
//		
//		T6_CAPEITEM_MORGANA_1_0_request("", "Лист5_2!AL22"),		
//		T6_CAPEITEM_MORGANA_2_0_request("", "Лист5_2!AL23"),		
//		T6_CAPEITEM_MORGANA_3_0_request("", "Лист5_2!AL24"),		
//		T6_CAPEITEM_MORGANA_4_0_request("", "Лист5_2!AL25"),		
//		
//		T6_CAPEITEM_MORGANA_1_1_1_request("", "Лист5_2!AL26"),
//		T6_CAPEITEM_MORGANA_1_2_1_request("", "Лист5_2!AL27"),
//		T6_CAPEITEM_MORGANA_1_3_1_request("", "Лист5_2!AL28"),
//		T6_CAPEITEM_MORGANA_1_4_1_request("", "Лист5_2!AL29"),
//		
//		T6_CAPEITEM_MORGANA_2_1_2_request("", "Лист5_2!AL30"),
//		T6_CAPEITEM_MORGANA_2_2_2_request("", "Лист5_2!AL31"),
//		T6_CAPEITEM_MORGANA_2_3_2_request("", "Лист5_2!AL32"),
//		T6_CAPEITEM_MORGANA_2_4_2_request("", "Лист5_2!AL33"),
//		
//		T6_CAPEITEM_MORGANA_3_1_3_request("", "Лист5_2!AL34"),
//		T6_CAPEITEM_MORGANA_3_2_3_request("", "Лист5_2!AL35"),
//		T6_CAPEITEM_MORGANA_3_3_3_request("", "Лист5_2!AL36"),
//		T6_CAPEITEM_MORGANA_3_4_3_request("", "Лист5_2!AL37"),
//		
//		T6_CAPEITEM_DEMON_1_0_offer("Лист5_2!AP5"),		//Плащ демонов
//		T6_CAPEITEM_DEMON_2_0_offer("Лист5_2!AP6"),		
//		T6_CAPEITEM_DEMON_3_0_offer("Лист5_2!AP7"),		
//		T6_CAPEITEM_DEMON_4_0_offer("Лист5_2!AP8"),		
//		
//		T6_CAPEITEM_DEMON_1_1_1_offer("Лист5_2!AP9"),
//		T6_CAPEITEM_DEMON_1_2_1_offer("Лист5_2!AP10"),
//		T6_CAPEITEM_DEMON_1_3_1_offer("Лист5_2!AP11"),
//		T6_CAPEITEM_DEMON_1_4_1_offer("Лист5_2!AP12"),
//		
//		T6_CAPEITEM_DEMON_2_1_2_offer("Лист5_2!AP13"),
//		T6_CAPEITEM_DEMON_2_2_2_offer("Лист5_2!AP14"),
//		T6_CAPEITEM_DEMON_2_3_2_offer("Лист5_2!AP15"),
//		T6_CAPEITEM_DEMON_2_4_2_offer("Лист5_2!AP16"),
//		
//		T6_CAPEITEM_DEMON_3_1_3_offer("Лист5_2!AP17"),
//		T6_CAPEITEM_DEMON_3_2_3_offer("Лист5_2!AP18"),
//		T6_CAPEITEM_DEMON_3_3_3_offer("Лист5_2!AP19"),
//		T6_CAPEITEM_DEMON_3_4_3_offer("Лист5_2!AP20"),
//		
//		T6_CAPEITEM_DEMON_1_0_request("", "Лист5_2!AP22"),		
//		T6_CAPEITEM_DEMON_2_0_request("", "Лист5_2!AP23"),		
//		T6_CAPEITEM_DEMON_3_0_request("", "Лист5_2!AP24"),		
//		T6_CAPEITEM_DEMON_4_0_request("", "Лист5_2!AP25"),		
//		
//		T6_CAPEITEM_DEMON_1_1_1_request("", "Лист5_2!AP26"),
//		T6_CAPEITEM_DEMON_1_2_1_request("", "Лист5_2!AP27"),
//		T6_CAPEITEM_DEMON_1_3_1_request("", "Лист5_2!AP28"),
//		T6_CAPEITEM_DEMON_1_4_1_request("", "Лист5_2!AP29"),
//		
//		T6_CAPEITEM_DEMON_2_1_2_request("", "Лист5_2!AP30"),
//		T6_CAPEITEM_DEMON_2_2_2_request("", "Лист5_2!AP31"),
//		T6_CAPEITEM_DEMON_2_3_2_request("", "Лист5_2!AP32"),
//		T6_CAPEITEM_DEMON_2_4_2_request("", "Лист5_2!AP33"),
//		
//		T6_CAPEITEM_DEMON_3_1_3_request("", "Лист5_2!AP34"),
//		T6_CAPEITEM_DEMON_3_2_3_request("", "Лист5_2!AP35"),
//		T6_CAPEITEM_DEMON_3_3_3_request("", "Лист5_2!AP36"),
//		T6_CAPEITEM_DEMON_3_4_3_request("", "Лист5_2!AP37"),
//		
//		
//		T6_CAPEITEM_FW_BRECILIEN_1_0_offer("Лист5_2!AT5"),		//Плащ города brecilien
//		T6_CAPEITEM_FW_BRECILIEN_2_0_offer("Лист5_2!AT6"),		
//		T6_CAPEITEM_FW_BRECILIEN_3_0_offer("Лист5_2!AT7"),		
//		T6_CAPEITEM_FW_BRECILIEN_4_0_offer("Лист5_2!AT8"),		
//		
//		T6_CAPEITEM_FW_BRECILIEN_1_1_1_offer("Лист5_2!AT9"),
//		T6_CAPEITEM_FW_BRECILIEN_1_2_1_offer("Лист5_2!AT10"),
//		T6_CAPEITEM_FW_BRECILIEN_1_3_1_offer("Лист5_2!AT11"),
//		T6_CAPEITEM_FW_BRECILIEN_1_4_1_offer("Лист5_2!AT12"),
//		
//		T6_CAPEITEM_FW_BRECILIEN_2_1_2_offer("Лист5_2!AT13"),
//		T6_CAPEITEM_FW_BRECILIEN_2_2_2_offer("Лист5_2!AT14"),
//		T6_CAPEITEM_FW_BRECILIEN_2_3_2_offer("Лист5_2!AT15"),
//		T6_CAPEITEM_FW_BRECILIEN_2_4_2_offer("Лист5_2!AT16"),
//		
//		T6_CAPEITEM_FW_BRECILIEN_3_1_3_offer("Лист5_2!AT17"),
//		T6_CAPEITEM_FW_BRECILIEN_3_2_3_offer("Лист5_2!AT18"),
//		T6_CAPEITEM_FW_BRECILIEN_3_3_3_offer("Лист5_2!AT19"),
//		T6_CAPEITEM_FW_BRECILIEN_3_4_3_offer("Лист5_2!AT20"),
//		
//		T6_CAPEITEM_FW_BRECILIEN_1_0_request("", "Лист5_2!AT22"),		
//		T6_CAPEITEM_FW_BRECILIEN_2_0_request("", "Лист5_2!AT23"),		
//		T6_CAPEITEM_FW_BRECILIEN_3_0_request("", "Лист5_2!AT24"),		
//		T6_CAPEITEM_FW_BRECILIEN_4_0_request("", "Лист5_2!AT25"),		
//		
//		T6_CAPEITEM_FW_BRECILIEN_1_1_1_request("", "Лист5_2!AT26"),
//		T6_CAPEITEM_FW_BRECILIEN_1_2_1_request("", "Лист5_2!AT27"),
//		T6_CAPEITEM_FW_BRECILIEN_1_3_1_request("", "Лист5_2!AT28"),
//		T6_CAPEITEM_FW_BRECILIEN_1_4_1_request("", "Лист5_2!AT29"),
//		
//		T6_CAPEITEM_FW_BRECILIEN_2_1_2_request("", "Лист5_2!AT30"),
//		T6_CAPEITEM_FW_BRECILIEN_2_2_2_request("", "Лист5_2!AT31"),
//		T6_CAPEITEM_FW_BRECILIEN_2_3_2_request("", "Лист5_2!AT32"),
//		T6_CAPEITEM_FW_BRECILIEN_2_4_2_request("", "Лист5_2!AT33"),
//		
//		T6_CAPEITEM_FW_BRECILIEN_3_1_3_request("", "Лист5_2!AT34"),
//		T6_CAPEITEM_FW_BRECILIEN_3_2_3_request("", "Лист5_2!AT35"),
//		T6_CAPEITEM_FW_BRECILIEN_3_3_3_request("", "Лист5_2!AT36"),
//		T6_CAPEITEM_FW_BRECILIEN_3_4_3_request("", "Лист5_2!AT37"),
//		
//		T6_CAPEITEM_AVALON_1_0_offer("Лист5_2!AX5"),		//Авалонский плащ
//		T6_CAPEITEM_AVALON_2_0_offer("Лист5_2!AX6"),		
//		T6_CAPEITEM_AVALON_3_0_offer("Лист5_2!AX7"),		
//		T6_CAPEITEM_AVALON_4_0_offer("Лист5_2!AX8"),		
//		
//		T6_CAPEITEM_AVALON_1_1_1_offer("Лист5_2!AX9"),
//		T6_CAPEITEM_AVALON_1_2_1_offer("Лист5_2!AX10"),
//		T6_CAPEITEM_AVALON_1_3_1_offer("Лист5_2!AX11"),
//		T6_CAPEITEM_AVALON_1_4_1_offer("Лист5_2!AX12"),
//		
//		T6_CAPEITEM_AVALON_2_1_2_offer("Лист5_2!AX13"),
//		T6_CAPEITEM_AVALON_2_2_2_offer("Лист5_2!AX14"),
//		T6_CAPEITEM_AVALON_2_3_2_offer("Лист5_2!AX15"),
//		T6_CAPEITEM_AVALON_2_4_2_offer("Лист5_2!AX16"),
//		
//		T6_CAPEITEM_AVALON_3_1_3_offer("Лист5_2!AX17"),
//		T6_CAPEITEM_AVALON_3_2_3_offer("Лист5_2!AX18"),
//		T6_CAPEITEM_AVALON_3_3_3_offer("Лист5_2!AX19"),
//		T6_CAPEITEM_AVALON_3_4_3_offer("Лист5_2!AX20"),
//		
//		T6_CAPEITEM_AVALON_1_0_request("", "Лист5_2!AX22"),		
//		T6_CAPEITEM_AVALON_2_0_request("", "Лист5_2!AX23"),		
//		T6_CAPEITEM_AVALON_3_0_request("", "Лист5_2!AX24"),		
//		T6_CAPEITEM_AVALON_4_0_request("", "Лист5_2!AX25"),		
//		
//		T6_CAPEITEM_AVALON_1_1_1_request("", "Лист5_2!AX26"),
//		T6_CAPEITEM_AVALON_1_2_1_request("", "Лист5_2!AX27"),
//		T6_CAPEITEM_AVALON_1_3_1_request("", "Лист5_2!AX28"),
//		T6_CAPEITEM_AVALON_1_4_1_request("", "Лист5_2!AX29"),
//		
//		T6_CAPEITEM_AVALON_2_1_2_request("", "Лист5_2!AX30"),
//		T6_CAPEITEM_AVALON_2_2_2_request("", "Лист5_2!AX31"),
//		T6_CAPEITEM_AVALON_2_3_2_request("", "Лист5_2!AX32"),
//		T6_CAPEITEM_AVALON_2_4_2_request("", "Лист5_2!AX33"),
//		
//		T6_CAPEITEM_AVALON_3_1_3_request("", "Лист5_2!AX34"),
//		T6_CAPEITEM_AVALON_3_2_3_request("", "Лист5_2!AX35"),
//		T6_CAPEITEM_AVALON_3_3_3_request("", "Лист5_2!AX36"),
//		T6_CAPEITEM_AVALON_3_4_3_request("", "Лист5_2!AX37"),
//		
//		T7_CAPEITEM_FW_BRIDGEWATCH_BP_1_0_offer("Лист5_3!B52"), 	//Герб города Bridgewatch
//		T7_CAPEITEM_FW_FORTSTERLING_BP_1_0_offer("Лист5_3!B53"), 	//Герб города Fort
//		T7_CAPEITEM_FW_LYMHURST_BP_1_0_offer("Лист5_3!B54"), 		//Герб города Lymhurst
//		T7_CAPEITEM_FW_MARTLOCK_BP_1_0_offer("Лист5_3!B55"), 		//Герб города Martlock
//		T7_CAPEITEM_FW_THETFORD_BP_1_0_offer("Лист5_3!B56"), 		//Герб города Thetford
//		T7_CAPEITEM_FW_CAERLEON_BP_1_0_offer("Лист5_3!B57"), 		//Герб города Caerleon
//		T7_CAPEITEM_HERETIC_BP_1_0_offer("Лист5_3!B58"), 			//Герб Еретиков
//		T7_CAPEITEM_UNDEAD_BP_1_0_offer("Лист5_3!B59"), 			//Герб Нежити
//		T7_CAPEITEM_KEEPER_BP_1_0_offer("Лист5_3!B60"), 			//Герб Хранителей
//		T7_CAPEITEM_MORGANA_BP_1_0_offer("Лист5_3!B61"), 			//Герб Морганы
//		T7_CAPEITEM_DEMON_BP_1_0_offer("Лист5_3!B62"), 			//Герб Демонов
//		T7_CAPEITEM_FW_BRECILIEN_BP_1_0_offer("Лист5_3!B63"), 	//Герб города Brecilien
//		
//		
//		T7_CAPE_1_0_offer("Лист5_3!D40"),	//Плащ Т7
//		T7_CAPE_2_0_offer("Лист5_3!D41"),		
//		T7_CAPE_3_0_offer("Лист5_3!D42"),		
//		T7_CAPE_4_0_offer("Лист5_3!D43"),		
//		
//		T7_CAPE_1_1_1_offer("Лист5_3!D44"),
//		T7_CAPE_1_2_1_offer("Лист5_3!D45"),
//		T7_CAPE_1_3_1_offer("Лист5_3!D46"),
//		T7_CAPE_1_4_1_offer("Лист5_3!D47"),
//		
//		T7_CAPE_2_1_2_offer("Лист5_3!D48"),
//		T7_CAPE_2_2_2_offer("Лист5_3!D49"),
//		T7_CAPE_2_3_2_offer("Лист5_3!D50"),
//		T7_CAPE_2_4_2_offer("Лист5_3!D51"),
//		
//		T7_CAPE_3_1_3_offer("Лист5_3!D52"),
//		T7_CAPE_3_2_3_offer("Лист5_3!D53"),
//		T7_CAPE_3_3_3_offer("Лист5_3!D54"),
//		T7_CAPE_3_4_3_offer("Лист5_3!D55"),
//		
//		T7_RUNE_1_0_offer("Лист5_3!B48"), 	//Руна Т7
//		T7_SOUL_1_0_offer("Лист5_3!B49"), 	//Душа Т7
//		T7_RELIC_1_0_offer("Лист5_3!B50"), 	//Реликт Т7
//		
//		
//		T7_CAPEITEM_FW_BRIDGEWATCH_1_0_offer("Лист5_3!B5"),		//Накидка знатока Bridgewatch
//		T7_CAPEITEM_FW_BRIDGEWATCH_2_0_offer("Лист5_3!B6"),		
//		T7_CAPEITEM_FW_BRIDGEWATCH_3_0_offer("Лист5_3!B7"),		
//		T7_CAPEITEM_FW_BRIDGEWATCH_4_0_offer("Лист5_3!B8"),		
//		
//		T7_CAPEITEM_FW_BRIDGEWATCH_1_1_1_offer("Лист5_3!B9"),
//		T7_CAPEITEM_FW_BRIDGEWATCH_1_2_1_offer("Лист5_3!B10"),
//		T7_CAPEITEM_FW_BRIDGEWATCH_1_3_1_offer("Лист5_3!B11"),
//		T7_CAPEITEM_FW_BRIDGEWATCH_1_4_1_offer("Лист5_3!B12"),
//		
//		T7_CAPEITEM_FW_BRIDGEWATCH_2_1_2_offer("Лист5_3!B13"),
//		T7_CAPEITEM_FW_BRIDGEWATCH_2_2_2_offer("Лист5_3!B14"),
//		T7_CAPEITEM_FW_BRIDGEWATCH_2_3_2_offer("Лист5_3!B15"),
//		T7_CAPEITEM_FW_BRIDGEWATCH_2_4_2_offer("Лист5_3!B16"),
//		
//		T7_CAPEITEM_FW_BRIDGEWATCH_3_1_3_offer("Лист5_3!B17"),
//		T7_CAPEITEM_FW_BRIDGEWATCH_3_2_3_offer("Лист5_3!B18"),
//		T7_CAPEITEM_FW_BRIDGEWATCH_3_3_3_offer("Лист5_3!B19"),
//		T7_CAPEITEM_FW_BRIDGEWATCH_3_4_3_offer("Лист5_3!B20"),
//		
//		T7_CAPEITEM_FW_BRIDGEWATCH_1_0_request("", "Лист5_3!B22"),		
//		T7_CAPEITEM_FW_BRIDGEWATCH_2_0_request("", "Лист5_3!B23"),		
//		T7_CAPEITEM_FW_BRIDGEWATCH_3_0_request("", "Лист5_3!B24"),		
//		T7_CAPEITEM_FW_BRIDGEWATCH_4_0_request("", "Лист5_3!B25"),		
//		
//		T7_CAPEITEM_FW_BRIDGEWATCH_1_1_1_request("", "Лист5_3!B26"),
//		T7_CAPEITEM_FW_BRIDGEWATCH_1_2_1_request("", "Лист5_3!B27"),
//		T7_CAPEITEM_FW_BRIDGEWATCH_1_3_1_request("", "Лист5_3!B28"),
//		T7_CAPEITEM_FW_BRIDGEWATCH_1_4_1_request("", "Лист5_3!B29"),
//		
//		T7_CAPEITEM_FW_BRIDGEWATCH_2_1_2_request("", "Лист5_3!B30"),
//		T7_CAPEITEM_FW_BRIDGEWATCH_2_2_2_request("", "Лист5_3!B31"),
//		T7_CAPEITEM_FW_BRIDGEWATCH_2_3_2_request("", "Лист5_3!B32"),
//		T7_CAPEITEM_FW_BRIDGEWATCH_2_4_2_request("", "Лист5_3!B33"),
//		
//		T7_CAPEITEM_FW_BRIDGEWATCH_3_1_3_request("", "Лист5_3!B34"),
//		T7_CAPEITEM_FW_BRIDGEWATCH_3_2_3_request("", "Лист5_3!B35"),
//		T7_CAPEITEM_FW_BRIDGEWATCH_3_3_3_request("", "Лист5_3!B36"),
//		T7_CAPEITEM_FW_BRIDGEWATCH_3_4_3_request("", "Лист5_3!B37"),
//		
//		
//		T7_CAPEITEM_FW_FORTSTERLING_1_0_offer("Лист5_3!F5"),		//Накидка знатока FortSterling
//		T7_CAPEITEM_FW_FORTSTERLING_2_0_offer("Лист5_3!F6"),		
//		T7_CAPEITEM_FW_FORTSTERLING_3_0_offer("Лист5_3!F7"),		
//		T7_CAPEITEM_FW_FORTSTERLING_4_0_offer("Лист5_3!F8"),		
//		
//		T7_CAPEITEM_FW_FORTSTERLING_1_1_1_offer("Лист5_3!F9"),
//		T7_CAPEITEM_FW_FORTSTERLING_1_2_1_offer("Лист5_3!F10"),
//		T7_CAPEITEM_FW_FORTSTERLING_1_3_1_offer("Лист5_3!F11"),
//		T7_CAPEITEM_FW_FORTSTERLING_1_4_1_offer("Лист5_3!F12"),
//		
//		T7_CAPEITEM_FW_FORTSTERLING_2_1_2_offer("Лист5_3!F13"),
//		T7_CAPEITEM_FW_FORTSTERLING_2_2_2_offer("Лист5_3!F14"),
//		T7_CAPEITEM_FW_FORTSTERLING_2_3_2_offer("Лист5_3!F15"),
//		T7_CAPEITEM_FW_FORTSTERLING_2_4_2_offer("Лист5_3!F16"),
//		
//		T7_CAPEITEM_FW_FORTSTERLING_3_1_3_offer("Лист5_3!F17"),
//		T7_CAPEITEM_FW_FORTSTERLING_3_2_3_offer("Лист5_3!F18"),
//		T7_CAPEITEM_FW_FORTSTERLING_3_3_3_offer("Лист5_3!F19"),
//		T7_CAPEITEM_FW_FORTSTERLING_3_4_3_offer("Лист5_3!F20"),
//		
//		T7_CAPEITEM_FW_FORTSTERLING_1_0_request("", "Лист5_3!F22"),		
//		T7_CAPEITEM_FW_FORTSTERLING_2_0_request("", "Лист5_3!F23"),		
//		T7_CAPEITEM_FW_FORTSTERLING_3_0_request("", "Лист5_3!F24"),		
//		T7_CAPEITEM_FW_FORTSTERLING_4_0_request("", "Лист5_3!F25"),		
//		
//		T7_CAPEITEM_FW_FORTSTERLING_1_1_1_request("", "Лист5_3!F26"),
//		T7_CAPEITEM_FW_FORTSTERLING_1_2_1_request("", "Лист5_3!F27"),
//		T7_CAPEITEM_FW_FORTSTERLING_1_3_1_request("", "Лист5_3!F28"),
//		T7_CAPEITEM_FW_FORTSTERLING_1_4_1_request("", "Лист5_3!F29"),
//		
//		T7_CAPEITEM_FW_FORTSTERLING_2_1_2_request("", "Лист5_3!F30"),
//		T7_CAPEITEM_FW_FORTSTERLING_2_2_2_request("", "Лист5_3!F31"),
//		T7_CAPEITEM_FW_FORTSTERLING_2_3_2_request("", "Лист5_3!F32"),
//		T7_CAPEITEM_FW_FORTSTERLING_2_4_2_request("", "Лист5_3!F33"),
//		
//		T7_CAPEITEM_FW_FORTSTERLING_3_1_3_request("", "Лист5_3!F34"),
//		T7_CAPEITEM_FW_FORTSTERLING_3_2_3_request("", "Лист5_3!F35"),
//		T7_CAPEITEM_FW_FORTSTERLING_3_3_3_request("", "Лист5_3!F36"),
//		T7_CAPEITEM_FW_FORTSTERLING_3_4_3_request("", "Лист5_3!F37"),
//		
//		T7_CAPEITEM_FW_LYMHURST_1_0_offer("Лист5_3!J5"),		//Накидка знатока Lymhurst
//		T7_CAPEITEM_FW_LYMHURST_2_0_offer("Лист5_3!J6"),		
//		T7_CAPEITEM_FW_LYMHURST_3_0_offer("Лист5_3!J7"),		
//		T7_CAPEITEM_FW_LYMHURST_4_0_offer("Лист5_3!J8"),		
//		
//		T7_CAPEITEM_FW_LYMHURST_1_1_1_offer("Лист5_3!J9"),
//		T7_CAPEITEM_FW_LYMHURST_1_2_1_offer("Лист5_3!J10"),
//		T7_CAPEITEM_FW_LYMHURST_1_3_1_offer("Лист5_3!J11"),
//		T7_CAPEITEM_FW_LYMHURST_1_4_1_offer("Лист5_3!J12"),
//		
//		T7_CAPEITEM_FW_LYMHURST_2_1_2_offer("Лист5_3!J13"),
//		T7_CAPEITEM_FW_LYMHURST_2_2_2_offer("Лист5_3!J14"),
//		T7_CAPEITEM_FW_LYMHURST_2_3_2_offer("Лист5_3!J15"),
//		T7_CAPEITEM_FW_LYMHURST_2_4_2_offer("Лист5_3!J16"),
//		
//		T7_CAPEITEM_FW_LYMHURST_3_1_3_offer("Лист5_3!J17"),
//		T7_CAPEITEM_FW_LYMHURST_3_2_3_offer("Лист5_3!J18"),
//		T7_CAPEITEM_FW_LYMHURST_3_3_3_offer("Лист5_3!J19"),
//		T7_CAPEITEM_FW_LYMHURST_3_4_3_offer("Лист5_3!J20"),
//		
//		T7_CAPEITEM_FW_LYMHURST_1_0_request("", "Лист5_3!J22"),		
//		T7_CAPEITEM_FW_LYMHURST_2_0_request("", "Лист5_3!J23"),		
//		T7_CAPEITEM_FW_LYMHURST_3_0_request("", "Лист5_3!J24"),		
//		T7_CAPEITEM_FW_LYMHURST_4_0_request("", "Лист5_3!J25"),		
//		
//		T7_CAPEITEM_FW_LYMHURST_1_1_1_request("", "Лист5_3!J26"),
//		T7_CAPEITEM_FW_LYMHURST_1_2_1_request("", "Лист5_3!J27"),
//		T7_CAPEITEM_FW_LYMHURST_1_3_1_request("", "Лист5_3!J28"),
//		T7_CAPEITEM_FW_LYMHURST_1_4_1_request("", "Лист5_3!J29"),
//		
//		T7_CAPEITEM_FW_LYMHURST_2_1_2_request("", "Лист5_3!J30"),
//		T7_CAPEITEM_FW_LYMHURST_2_2_2_request("", "Лист5_3!J31"),
//		T7_CAPEITEM_FW_LYMHURST_2_3_2_request("", "Лист5_3!J32"),
//		T7_CAPEITEM_FW_LYMHURST_2_4_2_request("", "Лист5_3!J33"),
//		
//		T7_CAPEITEM_FW_LYMHURST_3_1_3_request("", "Лист5_3!J34"),
//		T7_CAPEITEM_FW_LYMHURST_3_2_3_request("", "Лист5_3!J35"),
//		T7_CAPEITEM_FW_LYMHURST_3_3_3_request("", "Лист5_3!J36"),
//		T7_CAPEITEM_FW_LYMHURST_3_4_3_request("", "Лист5_3!J37"),
//		
//		T7_CAPEITEM_FW_MARTLOCK_1_0_offer("Лист5_3!N5"),		//Накидка знатока Martlock
//		T7_CAPEITEM_FW_MARTLOCK_2_0_offer("Лист5_3!N6"),		
//		T7_CAPEITEM_FW_MARTLOCK_3_0_offer("Лист5_3!N7"),		
//		T7_CAPEITEM_FW_MARTLOCK_4_0_offer("Лист5_3!N8"),		
//		
//		T7_CAPEITEM_FW_MARTLOCK_1_1_1_offer("Лист5_3!N9"),
//		T7_CAPEITEM_FW_MARTLOCK_1_2_1_offer("Лист5_3!N10"),
//		T7_CAPEITEM_FW_MARTLOCK_1_3_1_offer("Лист5_3!N11"),
//		T7_CAPEITEM_FW_MARTLOCK_1_4_1_offer("Лист5_3!N12"),
//		
//		T7_CAPEITEM_FW_MARTLOCK_2_1_2_offer("Лист5_3!N13"),
//		T7_CAPEITEM_FW_MARTLOCK_2_2_2_offer("Лист5_3!N14"),
//		T7_CAPEITEM_FW_MARTLOCK_2_3_2_offer("Лист5_3!N15"),
//		T7_CAPEITEM_FW_MARTLOCK_2_4_2_offer("Лист5_3!N16"),
//		
//		T7_CAPEITEM_FW_MARTLOCK_3_1_3_offer("Лист5_3!N17"),
//		T7_CAPEITEM_FW_MARTLOCK_3_2_3_offer("Лист5_3!N18"),
//		T7_CAPEITEM_FW_MARTLOCK_3_3_3_offer("Лист5_3!N19"),
//		T7_CAPEITEM_FW_MARTLOCK_3_4_3_offer("Лист5_3!N20"),
//		
//		T7_CAPEITEM_FW_MARTLOCK_1_0_request("", "Лист5_3!N22"),		
//		T7_CAPEITEM_FW_MARTLOCK_2_0_request("", "Лист5_3!N23"),		
//		T7_CAPEITEM_FW_MARTLOCK_3_0_request("", "Лист5_3!N24"),		
//		T7_CAPEITEM_FW_MARTLOCK_4_0_request("", "Лист5_3!N25"),		
//		
//		T7_CAPEITEM_FW_MARTLOCK_1_1_1_request("", "Лист5_3!N26"),
//		T7_CAPEITEM_FW_MARTLOCK_1_2_1_request("", "Лист5_3!N27"),
//		T7_CAPEITEM_FW_MARTLOCK_1_3_1_request("", "Лист5_3!N28"),
//		T7_CAPEITEM_FW_MARTLOCK_1_4_1_request("", "Лист5_3!N29"),
//		
//		T7_CAPEITEM_FW_MARTLOCK_2_1_2_request("", "Лист5_3!N30"),
//		T7_CAPEITEM_FW_MARTLOCK_2_2_2_request("", "Лист5_3!N31"),
//		T7_CAPEITEM_FW_MARTLOCK_2_3_2_request("", "Лист5_3!N32"),
//		T7_CAPEITEM_FW_MARTLOCK_2_4_2_request("", "Лист5_3!N33"),
//		
//		T7_CAPEITEM_FW_MARTLOCK_3_1_3_request("", "Лист5_3!N34"),
//		T7_CAPEITEM_FW_MARTLOCK_3_2_3_request("", "Лист5_3!N35"),
//		T7_CAPEITEM_FW_MARTLOCK_3_3_3_request("", "Лист5_3!N36"),
//		T7_CAPEITEM_FW_MARTLOCK_3_4_3_request("", "Лист5_3!N37"),
//		
//		T7_CAPEITEM_FW_THETFORD_1_0_offer("Лист5_3!R5"),		//Накидка знатока Therford
//		T7_CAPEITEM_FW_THETFORD_2_0_offer("Лист5_3!R6"),		
//		T7_CAPEITEM_FW_THETFORD_3_0_offer("Лист5_3!R7"),		
//		T7_CAPEITEM_FW_THETFORD_4_0_offer("Лист5_3!R8"),		
//		
//		T7_CAPEITEM_FW_THETFORD_1_1_1_offer("Лист5_3!R9"),
//		T7_CAPEITEM_FW_THETFORD_1_2_1_offer("Лист5_3!R10"),
//		T7_CAPEITEM_FW_THETFORD_1_3_1_offer("Лист5_3!R11"),
//		T7_CAPEITEM_FW_THETFORD_1_4_1_offer("Лист5_3!R12"),
//		
//		T7_CAPEITEM_FW_THETFORD_2_1_2_offer("Лист5_3!R13"),
//		T7_CAPEITEM_FW_THETFORD_2_2_2_offer("Лист5_3!R14"),
//		T7_CAPEITEM_FW_THETFORD_2_3_2_offer("Лист5_3!R15"),
//		T7_CAPEITEM_FW_THETFORD_2_4_2_offer("Лист5_3!R16"),
//		
//		T7_CAPEITEM_FW_THETFORD_3_1_3_offer("Лист5_3!R17"),
//		T7_CAPEITEM_FW_THETFORD_3_2_3_offer("Лист5_3!R18"),
//		T7_CAPEITEM_FW_THETFORD_3_3_3_offer("Лист5_3!R19"),
//		T7_CAPEITEM_FW_THETFORD_3_4_3_offer("Лист5_3!R20"),
//		
//		T7_CAPEITEM_FW_THETFORD_1_0_request("", "Лист5_3!R22"),		
//		T7_CAPEITEM_FW_THETFORD_2_0_request("", "Лист5_3!R23"),		
//		T7_CAPEITEM_FW_THETFORD_3_0_request("", "Лист5_3!R24"),		
//		T7_CAPEITEM_FW_THETFORD_4_0_request("", "Лист5_3!R25"),		
//		
//		T7_CAPEITEM_FW_THETFORD_1_1_1_request("", "Лист5_3!R26"),
//		T7_CAPEITEM_FW_THETFORD_1_2_1_request("", "Лист5_3!R27"),
//		T7_CAPEITEM_FW_THETFORD_1_3_1_request("", "Лист5_3!R28"),
//		T7_CAPEITEM_FW_THETFORD_1_4_1_request("", "Лист5_3!R29"),
//		
//		T7_CAPEITEM_FW_THETFORD_2_1_2_request("", "Лист5_3!R30"),
//		T7_CAPEITEM_FW_THETFORD_2_2_2_request("", "Лист5_3!R31"),
//		T7_CAPEITEM_FW_THETFORD_2_3_2_request("", "Лист5_3!R32"),
//		T7_CAPEITEM_FW_THETFORD_2_4_2_request("", "Лист5_3!R33"),
//		
//		T7_CAPEITEM_FW_THETFORD_3_1_3_request("", "Лист5_3!R34"),
//		T7_CAPEITEM_FW_THETFORD_3_2_3_request("", "Лист5_3!R35"),
//		T7_CAPEITEM_FW_THETFORD_3_3_3_request("", "Лист5_3!R36"),
//		T7_CAPEITEM_FW_THETFORD_3_4_3_request("", "Лист5_3!R37"),
//		
//		T7_CAPEITEM_FW_CAERLEON_1_0_offer("Лист5_3!V5"),		//Плащ города Caerleon
//		T7_CAPEITEM_FW_CAERLEON_2_0_offer("Лист5_3!V6"),		
//		T7_CAPEITEM_FW_CAERLEON_3_0_offer("Лист5_3!V7"),		
//		T7_CAPEITEM_FW_CAERLEON_4_0_offer("Лист5_3!V8"),		
//		
//		T7_CAPEITEM_FW_CAERLEON_1_1_1_offer("Лист5_3!V9"),
//		T7_CAPEITEM_FW_CAERLEON_1_2_1_offer("Лист5_3!V10"),
//		T7_CAPEITEM_FW_CAERLEON_1_3_1_offer("Лист5_3!V11"),
//		T7_CAPEITEM_FW_CAERLEON_1_4_1_offer("Лист5_3!V12"),
//		
//		T7_CAPEITEM_FW_CAERLEON_2_1_2_offer("Лист5_3!V13"),
//		T7_CAPEITEM_FW_CAERLEON_2_2_2_offer("Лист5_3!V14"),
//		T7_CAPEITEM_FW_CAERLEON_2_3_2_offer("Лист5_3!V15"),
//		T7_CAPEITEM_FW_CAERLEON_2_4_2_offer("Лист5_3!V16"),
//		
//		T7_CAPEITEM_FW_CAERLEON_3_1_3_offer("Лист5_3!V17"),
//		T7_CAPEITEM_FW_CAERLEON_3_2_3_offer("Лист5_3!V18"),
//		T7_CAPEITEM_FW_CAERLEON_3_3_3_offer("Лист5_3!V19"),
//		T7_CAPEITEM_FW_CAERLEON_3_4_3_offer("Лист5_3!V20"),
//		
//		T7_CAPEITEM_FW_CAERLEON_1_0_request("", "Лист5_3!V22"),		
//		T7_CAPEITEM_FW_CAERLEON_2_0_request("", "Лист5_3!V23"),		
//		T7_CAPEITEM_FW_CAERLEON_3_0_request("", "Лист5_3!V24"),		
//		T7_CAPEITEM_FW_CAERLEON_4_0_request("", "Лист5_3!V25"),		
//		
//		T7_CAPEITEM_FW_CAERLEON_1_1_1_request("", "Лист5_3!V26"),
//		T7_CAPEITEM_FW_CAERLEON_1_2_1_request("", "Лист5_3!V27"),
//		T7_CAPEITEM_FW_CAERLEON_1_3_1_request("", "Лист5_3!V28"),
//		T7_CAPEITEM_FW_CAERLEON_1_4_1_request("", "Лист5_3!V29"),
//		
//		T7_CAPEITEM_FW_CAERLEON_2_1_2_request("", "Лист5_3!V30"),
//		T7_CAPEITEM_FW_CAERLEON_2_2_2_request("", "Лист5_3!V31"),
//		T7_CAPEITEM_FW_CAERLEON_2_3_2_request("", "Лист5_3!V32"),
//		T7_CAPEITEM_FW_CAERLEON_2_4_2_request("", "Лист5_3!V33"),
//		
//		T7_CAPEITEM_FW_CAERLEON_3_1_3_request("", "Лист5_3!V34"),
//		T7_CAPEITEM_FW_CAERLEON_3_2_3_request("", "Лист5_3!V35"),
//		T7_CAPEITEM_FW_CAERLEON_3_3_3_request("", "Лист5_3!V36"),
//		T7_CAPEITEM_FW_CAERLEON_3_4_3_request("", "Лист5_3!V37"),
//		
//		T7_CAPEITEM_HERETIC_1_0_offer("Лист5_3!Z5"),		//Плащ еретиков
//		T7_CAPEITEM_HERETIC_2_0_offer("Лист5_3!Z6"),		
//		T7_CAPEITEM_HERETIC_3_0_offer("Лист5_3!Z7"),		
//		T7_CAPEITEM_HERETIC_4_0_offer("Лист5_3!Z8"),		
//		
//		T7_CAPEITEM_HERETIC_1_1_1_offer("Лист5_3!Z9"),
//		T7_CAPEITEM_HERETIC_1_2_1_offer("Лист5_3!Z10"),
//		T7_CAPEITEM_HERETIC_1_3_1_offer("Лист5_3!Z11"),
//		T7_CAPEITEM_HERETIC_1_4_1_offer("Лист5_3!Z12"),
//		
//		T7_CAPEITEM_HERETIC_2_1_2_offer("Лист5_3!Z13"),
//		T7_CAPEITEM_HERETIC_2_2_2_offer("Лист5_3!Z14"),
//		T7_CAPEITEM_HERETIC_2_3_2_offer("Лист5_3!Z15"),
//		T7_CAPEITEM_HERETIC_2_4_2_offer("Лист5_3!Z16"),
//		
//		T7_CAPEITEM_HERETIC_3_1_3_offer("Лист5_3!Z17"),
//		T7_CAPEITEM_HERETIC_3_2_3_offer("Лист5_3!Z18"),
//		T7_CAPEITEM_HERETIC_3_3_3_offer("Лист5_3!Z19"),
//		T7_CAPEITEM_HERETIC_3_4_3_offer("Лист5_3!Z20"),
//		
//		T7_CAPEITEM_HERETIC_1_0_request("", "Лист5_3!Z22"),		
//		T7_CAPEITEM_HERETIC_2_0_request("", "Лист5_3!Z23"),		
//		T7_CAPEITEM_HERETIC_3_0_request("", "Лист5_3!Z24"),		
//		T7_CAPEITEM_HERETIC_4_0_request("", "Лист5_3!Z25"),		
//		
//		T7_CAPEITEM_HERETIC_1_1_1_request("", "Лист5_3!Z26"),
//		T7_CAPEITEM_HERETIC_1_2_1_request("", "Лист5_3!Z27"),
//		T7_CAPEITEM_HERETIC_1_3_1_request("", "Лист5_3!Z28"),
//		T7_CAPEITEM_HERETIC_1_4_1_request("", "Лист5_3!Z29"),
//		
//		T7_CAPEITEM_HERETIC_2_1_2_request("", "Лист5_3!Z30"),
//		T7_CAPEITEM_HERETIC_2_2_2_request("", "Лист5_3!Z31"),
//		T7_CAPEITEM_HERETIC_2_3_2_request("", "Лист5_3!Z32"),
//		T7_CAPEITEM_HERETIC_2_4_2_request("", "Лист5_3!Z33"),
//		
//		T7_CAPEITEM_HERETIC_3_1_3_request("", "Лист5_3!Z34"),
//		T7_CAPEITEM_HERETIC_3_2_3_request("", "Лист5_3!Z35"),
//		T7_CAPEITEM_HERETIC_3_3_3_request("", "Лист5_3!Z36"),
//		T7_CAPEITEM_HERETIC_3_4_3_request("", "Лист5_3!Z37"),
//		
//		T7_CAPEITEM_UNDEAD_1_0_offer("Лист5_3!AD5"),		//Плащ Нежити
//		T7_CAPEITEM_UNDEAD_2_0_offer("Лист5_3!AD6"),		
//		T7_CAPEITEM_UNDEAD_3_0_offer("Лист5_3!AD7"),		
//		T7_CAPEITEM_UNDEAD_4_0_offer("Лист5_3!AD8"),		
//		
//		T7_CAPEITEM_UNDEAD_1_1_1_offer("Лист5_3!AD9"),
//		T7_CAPEITEM_UNDEAD_1_2_1_offer("Лист5_3!AD10"),
//		T7_CAPEITEM_UNDEAD_1_3_1_offer("Лист5_3!AD11"),
//		T7_CAPEITEM_UNDEAD_1_4_1_offer("Лист5_3!AD12"),
//		
//		T7_CAPEITEM_UNDEAD_2_1_2_offer("Лист5_3!AD13"),
//		T7_CAPEITEM_UNDEAD_2_2_2_offer("Лист5_3!AD14"),
//		T7_CAPEITEM_UNDEAD_2_3_2_offer("Лист5_3!AD15"),
//		T7_CAPEITEM_UNDEAD_2_4_2_offer("Лист5_3!AD16"),
//		
//		T7_CAPEITEM_UNDEAD_3_1_3_offer("Лист5_3!AD17"),
//		T7_CAPEITEM_UNDEAD_3_2_3_offer("Лист5_3!AD18"),
//		T7_CAPEITEM_UNDEAD_3_3_3_offer("Лист5_3!AD19"),
//		T7_CAPEITEM_UNDEAD_3_4_3_offer("Лист5_3!AD20"),
//		
//		T7_CAPEITEM_UNDEAD_1_0_request("", "Лист5_3!AD22"),		
//		T7_CAPEITEM_UNDEAD_2_0_request("", "Лист5_3!AD23"),		
//		T7_CAPEITEM_UNDEAD_3_0_request("", "Лист5_3!AD24"),		
//		T7_CAPEITEM_UNDEAD_4_0_request("", "Лист5_3!AD25"),		
//		
//		T7_CAPEITEM_UNDEAD_1_1_1_request("", "Лист5_3!AD26"),
//		T7_CAPEITEM_UNDEAD_1_2_1_request("", "Лист5_3!AD27"),
//		T7_CAPEITEM_UNDEAD_1_3_1_request("", "Лист5_3!AD28"),
//		T7_CAPEITEM_UNDEAD_1_4_1_request("", "Лист5_3!AD29"),
//		
//		T7_CAPEITEM_UNDEAD_2_1_2_request("", "Лист5_3!AD30"),
//		T7_CAPEITEM_UNDEAD_2_2_2_request("", "Лист5_3!AD31"),
//		T7_CAPEITEM_UNDEAD_2_3_2_request("", "Лист5_3!AD32"),
//		T7_CAPEITEM_UNDEAD_2_4_2_request("", "Лист5_3!AD33"),
//		
//		T7_CAPEITEM_UNDEAD_3_1_3_request("", "Лист5_3!AD34"),
//		T7_CAPEITEM_UNDEAD_3_2_3_request("", "Лист5_3!AD35"),
//		T7_CAPEITEM_UNDEAD_3_3_3_request("", "Лист5_3!AD36"),
//		T7_CAPEITEM_UNDEAD_3_4_3_request("", "Лист5_3!AD37"),
//		
//		T7_CAPEITEM_KEEPER_1_0_offer("Лист5_3!AH5"),		//Плащ Хранителей
//		T7_CAPEITEM_KEEPER_2_0_offer("Лист5_3!AH6"),		
//		T7_CAPEITEM_KEEPER_3_0_offer("Лист5_3!AH7"),		
//		T7_CAPEITEM_KEEPER_4_0_offer("Лист5_3!AH8"),		
//		
//		T7_CAPEITEM_KEEPER_1_1_1_offer("Лист5_3!AH9"),
//		T7_CAPEITEM_KEEPER_1_2_1_offer("Лист5_3!AH10"),
//		T7_CAPEITEM_KEEPER_1_3_1_offer("Лист5_3!AH11"),
//		T7_CAPEITEM_KEEPER_1_4_1_offer("Лист5_3!AH12"),
//		
//		T7_CAPEITEM_KEEPER_2_1_2_offer("Лист5_3!AH13"),
//		T7_CAPEITEM_KEEPER_2_2_2_offer("Лист5_3!AH14"),
//		T7_CAPEITEM_KEEPER_2_3_2_offer("Лист5_3!AH15"),
//		T7_CAPEITEM_KEEPER_2_4_2_offer("Лист5_3!AH16"),
//		
//		T7_CAPEITEM_KEEPER_3_1_3_offer("Лист5_3!AH17"),
//		T7_CAPEITEM_KEEPER_3_2_3_offer("Лист5_3!AH18"),
//		T7_CAPEITEM_KEEPER_3_3_3_offer("Лист5_3!AH19"),
//		T7_CAPEITEM_KEEPER_3_4_3_offer("Лист5_3!AH20"),
//		
//		T7_CAPEITEM_KEEPER_1_0_request("", "Лист5_3!AH22"),		
//		T7_CAPEITEM_KEEPER_2_0_request("", "Лист5_3!AH23"),		
//		T7_CAPEITEM_KEEPER_3_0_request("", "Лист5_3!AH24"),		
//		T7_CAPEITEM_KEEPER_4_0_request("", "Лист5_3!AH25"),		
//		
//		T7_CAPEITEM_KEEPER_1_1_1_request("", "Лист5_3!AH26"),
//		T7_CAPEITEM_KEEPER_1_2_1_request("", "Лист5_3!AH27"),
//		T7_CAPEITEM_KEEPER_1_3_1_request("", "Лист5_3!AH28"),
//		T7_CAPEITEM_KEEPER_1_4_1_request("", "Лист5_3!AH29"),
//		
//		T7_CAPEITEM_KEEPER_2_1_2_request("", "Лист5_3!AH30"),
//		T7_CAPEITEM_KEEPER_2_2_2_request("", "Лист5_3!AH31"),
//		T7_CAPEITEM_KEEPER_2_3_2_request("", "Лист5_3!AH32"),
//		T7_CAPEITEM_KEEPER_2_4_2_request("", "Лист5_3!AH33"),
//		
//		T7_CAPEITEM_KEEPER_3_1_3_request("", "Лист5_3!AH34"),
//		T7_CAPEITEM_KEEPER_3_2_3_request("", "Лист5_3!AH35"),
//		T7_CAPEITEM_KEEPER_3_3_3_request("", "Лист5_3!AH36"),
//		T7_CAPEITEM_KEEPER_3_4_3_request("", "Лист5_3!AH37"),
//		
//		T7_CAPEITEM_MORGANA_1_0_offer("Лист5_3!AL5"),		//Плащ морганы
//		T7_CAPEITEM_MORGANA_2_0_offer("Лист5_3!AL6"),		
//		T7_CAPEITEM_MORGANA_3_0_offer("Лист5_3!AL7"),		
//		T7_CAPEITEM_MORGANA_4_0_offer("Лист5_3!AL8"),		
//		
//		T7_CAPEITEM_MORGANA_1_1_1_offer("Лист5_3!AL9"),
//		T7_CAPEITEM_MORGANA_1_2_1_offer("Лист5_3!AL10"),
//		T7_CAPEITEM_MORGANA_1_3_1_offer("Лист5_3!AL11"),
//		T7_CAPEITEM_MORGANA_1_4_1_offer("Лист5_3!AL12"),
//		
//		T7_CAPEITEM_MORGANA_2_1_2_offer("Лист5_3!AL13"),
//		T7_CAPEITEM_MORGANA_2_2_2_offer("Лист5_3!AL14"),
//		T7_CAPEITEM_MORGANA_2_3_2_offer("Лист5_3!AL15"),
//		T7_CAPEITEM_MORGANA_2_4_2_offer("Лист5_3!AL16"),
//		
//		T7_CAPEITEM_MORGANA_3_1_3_offer("Лист5_3!AL17"),
//		T7_CAPEITEM_MORGANA_3_2_3_offer("Лист5_3!AL18"),
//		T7_CAPEITEM_MORGANA_3_3_3_offer("Лист5_3!AL19"),
//		T7_CAPEITEM_MORGANA_3_4_3_offer("Лист5_3!AL20"),
//		
//		T7_CAPEITEM_MORGANA_1_0_request("", "Лист5_3!AL22"),		
//		T7_CAPEITEM_MORGANA_2_0_request("", "Лист5_3!AL23"),		
//		T7_CAPEITEM_MORGANA_3_0_request("", "Лист5_3!AL24"),		
//		T7_CAPEITEM_MORGANA_4_0_request("", "Лист5_3!AL25"),		
//		
//		T7_CAPEITEM_MORGANA_1_1_1_request("", "Лист5_3!AL26"),
//		T7_CAPEITEM_MORGANA_1_2_1_request("", "Лист5_3!AL27"),
//		T7_CAPEITEM_MORGANA_1_3_1_request("", "Лист5_3!AL28"),
//		T7_CAPEITEM_MORGANA_1_4_1_request("", "Лист5_3!AL29"),
//		
//		T7_CAPEITEM_MORGANA_2_1_2_request("", "Лист5_3!AL30"),
//		T7_CAPEITEM_MORGANA_2_2_2_request("", "Лист5_3!AL31"),
//		T7_CAPEITEM_MORGANA_2_3_2_request("", "Лист5_3!AL32"),
//		T7_CAPEITEM_MORGANA_2_4_2_request("", "Лист5_3!AL33"),
//		
//		T7_CAPEITEM_MORGANA_3_1_3_request("", "Лист5_3!AL34"),
//		T7_CAPEITEM_MORGANA_3_2_3_request("", "Лист5_3!AL35"),
//		T7_CAPEITEM_MORGANA_3_3_3_request("", "Лист5_3!AL36"),
//		T7_CAPEITEM_MORGANA_3_4_3_request("", "Лист5_3!AL37"),
//		
//		T7_CAPEITEM_DEMON_1_0_offer("Лист5_3!AP5"),		//Плащ демонов
//		T7_CAPEITEM_DEMON_2_0_offer("Лист5_3!AP6"),		
//		T7_CAPEITEM_DEMON_3_0_offer("Лист5_3!AP7"),		
//		T7_CAPEITEM_DEMON_4_0_offer("Лист5_3!AP8"),		
//		
//		T7_CAPEITEM_DEMON_1_1_1_offer("Лист5_3!AP9"),
//		T7_CAPEITEM_DEMON_1_2_1_offer("Лист5_3!AP10"),
//		T7_CAPEITEM_DEMON_1_3_1_offer("Лист5_3!AP11"),
//		T7_CAPEITEM_DEMON_1_4_1_offer("Лист5_3!AP12"),
//		
//		T7_CAPEITEM_DEMON_2_1_2_offer("Лист5_3!AP13"),
//		T7_CAPEITEM_DEMON_2_2_2_offer("Лист5_3!AP14"),
//		T7_CAPEITEM_DEMON_2_3_2_offer("Лист5_3!AP15"),
//		T7_CAPEITEM_DEMON_2_4_2_offer("Лист5_3!AP16"),
//		
//		T7_CAPEITEM_DEMON_3_1_3_offer("Лист5_3!AP17"),
//		T7_CAPEITEM_DEMON_3_2_3_offer("Лист5_3!AP18"),
//		T7_CAPEITEM_DEMON_3_3_3_offer("Лист5_3!AP19"),
//		T7_CAPEITEM_DEMON_3_4_3_offer("Лист5_3!AP20"),
//		
//		T7_CAPEITEM_DEMON_1_0_request("", "Лист5_3!AP22"),		
//		T7_CAPEITEM_DEMON_2_0_request("", "Лист5_3!AP23"),		
//		T7_CAPEITEM_DEMON_3_0_request("", "Лист5_3!AP24"),		
//		T7_CAPEITEM_DEMON_4_0_request("", "Лист5_3!AP25"),		
//		
//		T7_CAPEITEM_DEMON_1_1_1_request("", "Лист5_3!AP26"),
//		T7_CAPEITEM_DEMON_1_2_1_request("", "Лист5_3!AP27"),
//		T7_CAPEITEM_DEMON_1_3_1_request("", "Лист5_3!AP28"),
//		T7_CAPEITEM_DEMON_1_4_1_request("", "Лист5_3!AP29"),
//		
//		T7_CAPEITEM_DEMON_2_1_2_request("", "Лист5_3!AP30"),
//		T7_CAPEITEM_DEMON_2_2_2_request("", "Лист5_3!AP31"),
//		T7_CAPEITEM_DEMON_2_3_2_request("", "Лист5_3!AP32"),
//		T7_CAPEITEM_DEMON_2_4_2_request("", "Лист5_3!AP33"),
//		
//		T7_CAPEITEM_DEMON_3_1_3_request("", "Лист5_3!AP34"),
//		T7_CAPEITEM_DEMON_3_2_3_request("", "Лист5_3!AP35"),
//		T7_CAPEITEM_DEMON_3_3_3_request("", "Лист5_3!AP36"),
//		T7_CAPEITEM_DEMON_3_4_3_request("", "Лист5_3!AP37"),
//		
//		
//		T7_CAPEITEM_FW_BRECILIEN_1_0_offer("Лист5_3!AT5"),		//Плащ города brecilien
//		T7_CAPEITEM_FW_BRECILIEN_2_0_offer("Лист5_3!AT6"),		
//		T7_CAPEITEM_FW_BRECILIEN_3_0_offer("Лист5_3!AT7"),		
//		T7_CAPEITEM_FW_BRECILIEN_4_0_offer("Лист5_3!AT8"),		
//		
//		T7_CAPEITEM_FW_BRECILIEN_1_1_1_offer("Лист5_3!AT9"),
//		T7_CAPEITEM_FW_BRECILIEN_1_2_1_offer("Лист5_3!AT10"),
//		T7_CAPEITEM_FW_BRECILIEN_1_3_1_offer("Лист5_3!AT11"),
//		T7_CAPEITEM_FW_BRECILIEN_1_4_1_offer("Лист5_3!AT12"),
//		
//		T7_CAPEITEM_FW_BRECILIEN_2_1_2_offer("Лист5_3!AT13"),
//		T7_CAPEITEM_FW_BRECILIEN_2_2_2_offer("Лист5_3!AT14"),
//		T7_CAPEITEM_FW_BRECILIEN_2_3_2_offer("Лист5_3!AT15"),
//		T7_CAPEITEM_FW_BRECILIEN_2_4_2_offer("Лист5_3!AT16"),
//		
//		T7_CAPEITEM_FW_BRECILIEN_3_1_3_offer("Лист5_3!AT17"),
//		T7_CAPEITEM_FW_BRECILIEN_3_2_3_offer("Лист5_3!AT18"),
//		T7_CAPEITEM_FW_BRECILIEN_3_3_3_offer("Лист5_3!AT19"),
//		T7_CAPEITEM_FW_BRECILIEN_3_4_3_offer("Лист5_3!AT20"),
//		
//		T7_CAPEITEM_FW_BRECILIEN_1_0_request("", "Лист5_3!AT22"),		
//		T7_CAPEITEM_FW_BRECILIEN_2_0_request("", "Лист5_3!AT23"),		
//		T7_CAPEITEM_FW_BRECILIEN_3_0_request("", "Лист5_3!AT24"),		
//		T7_CAPEITEM_FW_BRECILIEN_4_0_request("", "Лист5_3!AT25"),		
//		
//		T7_CAPEITEM_FW_BRECILIEN_1_1_1_request("", "Лист5_3!AT26"),
//		T7_CAPEITEM_FW_BRECILIEN_1_2_1_request("", "Лист5_3!AT27"),
//		T7_CAPEITEM_FW_BRECILIEN_1_3_1_request("", "Лист5_3!AT28"),
//		T7_CAPEITEM_FW_BRECILIEN_1_4_1_request("", "Лист5_3!AT29"),
//		
//		T7_CAPEITEM_FW_BRECILIEN_2_1_2_request("", "Лист5_3!AT30"),
//		T7_CAPEITEM_FW_BRECILIEN_2_2_2_request("", "Лист5_3!AT31"),
//		T7_CAPEITEM_FW_BRECILIEN_2_3_2_request("", "Лист5_3!AT32"),
//		T7_CAPEITEM_FW_BRECILIEN_2_4_2_request("", "Лист5_3!AT33"),
//		
//		T7_CAPEITEM_FW_BRECILIEN_3_1_3_request("", "Лист5_3!AT34"),
//		T7_CAPEITEM_FW_BRECILIEN_3_2_3_request("", "Лист5_3!AT35"),
//		T7_CAPEITEM_FW_BRECILIEN_3_3_3_request("", "Лист5_3!AT36"),
//		T7_CAPEITEM_FW_BRECILIEN_3_4_3_request("", "Лист5_3!AT37"),
		
		T8_CAPEITEM_FW_BRIDGEWATCH_BP_1_0_offer("Лист5_4!B52"), 	//Герб города Bridgewatch
		T8_CAPEITEM_FW_FORTSTERLING_BP_1_0_offer("Лист5_4!B53"), 	//Герб города Fort
		T8_CAPEITEM_FW_LYMHURST_BP_1_0_offer("Лист5_4!B54"), 		//Герб города Lymhurst
		T8_CAPEITEM_FW_MARTLOCK_BP_1_0_offer("Лист5_4!B55"), 		//Герб города Martlock
		T8_CAPEITEM_FW_THETFORD_BP_1_0_offer("Лист5_4!B56"), 		//Герб города Thetford
		T8_CAPEITEM_FW_CAERLEON_BP_1_0_offer("Лист5_4!B57"), 		//Герб города Caerleon
		T8_CAPEITEM_HERETIC_BP_1_0_offer("Лист5_4!B58"), 			//Герб Еретиков
		T8_CAPEITEM_UNDEAD_BP_1_0_offer("Лист5_4!B59"), 			//Герб Нежити
		T8_CAPEITEM_KEEPER_BP_1_0_offer("Лист5_4!B60"), 			//Герб Хранителей
		T8_CAPEITEM_MORGANA_BP_1_0_offer("Лист5_4!B61"), 			//Герб Морганы
		T8_CAPEITEM_DEMON_BP_1_0_offer("Лист5_4!B62"), 			//Герб Демонов
		T8_CAPEITEM_FW_BRECILIEN_BP_1_0_offer("Лист5_4!B63"), 	//Герб города Brecilien
		
		
		T8_CAPE_1_0_offer("Лист5_4!D40"),	//Плащ Т8
		T8_CAPE_2_0_offer("Лист5_4!D41"),		
		T8_CAPE_3_0_offer("Лист5_4!D42"),		
		T8_CAPE_4_0_offer("Лист5_4!D43"),		
		
		T8_CAPE_1_1_1_offer("Лист5_4!D44"),
		T8_CAPE_1_2_1_offer("Лист5_4!D45"),
		T8_CAPE_1_3_1_offer("Лист5_4!D46"),
		T8_CAPE_1_4_1_offer("Лист5_4!D47"),
		
		T8_CAPE_2_1_2_offer("Лист5_4!D48"),
		T8_CAPE_2_2_2_offer("Лист5_4!D49"),
		T8_CAPE_2_3_2_offer("Лист5_4!D50"),
		T8_CAPE_2_4_2_offer("Лист5_4!D51"),
		
		T8_CAPE_3_1_3_offer("Лист5_4!D52"),
		T8_CAPE_3_2_3_offer("Лист5_4!D53"),
		T8_CAPE_3_3_3_offer("Лист5_4!D54"),
		T8_CAPE_3_4_3_offer("Лист5_4!D55"),
		
		T8_RUNE_1_0_offer("Лист5_4!B48"), 	//Руна Т8
		T8_SOUL_1_0_offer("Лист5_4!B49"), 	//Душа Т8
		T8_RELIC_1_0_offer("Лист5_4!B50"), 	//Реликт Т8
		
		
		T8_CAPEITEM_FW_BRIDGEWATCH_1_0_offer("Лист5_4!B5"),		//Накидка знатока Bridgewatch
		T8_CAPEITEM_FW_BRIDGEWATCH_2_0_offer("Лист5_4!B6"),		
		T8_CAPEITEM_FW_BRIDGEWATCH_3_0_offer("Лист5_4!B7"),		
		T8_CAPEITEM_FW_BRIDGEWATCH_4_0_offer("Лист5_4!B8"),		
		
		T8_CAPEITEM_FW_BRIDGEWATCH_1_1_1_offer("Лист5_4!B9"),
		T8_CAPEITEM_FW_BRIDGEWATCH_1_2_1_offer("Лист5_4!B10"),
		T8_CAPEITEM_FW_BRIDGEWATCH_1_3_1_offer("Лист5_4!B11"),
		T8_CAPEITEM_FW_BRIDGEWATCH_1_4_1_offer("Лист5_4!B12"),
		
		T8_CAPEITEM_FW_BRIDGEWATCH_2_1_2_offer("Лист5_4!B13"),
		T8_CAPEITEM_FW_BRIDGEWATCH_2_2_2_offer("Лист5_4!B14"),
		T8_CAPEITEM_FW_BRIDGEWATCH_2_3_2_offer("Лист5_4!B15"),
		T8_CAPEITEM_FW_BRIDGEWATCH_2_4_2_offer("Лист5_4!B16"),
		
		T8_CAPEITEM_FW_BRIDGEWATCH_3_1_3_offer("Лист5_4!B17"),
		T8_CAPEITEM_FW_BRIDGEWATCH_3_2_3_offer("Лист5_4!B18"),
		T8_CAPEITEM_FW_BRIDGEWATCH_3_3_3_offer("Лист5_4!B19"),
		T8_CAPEITEM_FW_BRIDGEWATCH_3_4_3_offer("Лист5_4!B20"),
		
		T8_CAPEITEM_FW_BRIDGEWATCH_1_0_request("", "Лист5_4!B22"),		
		T8_CAPEITEM_FW_BRIDGEWATCH_2_0_request("", "Лист5_4!B23"),		
		T8_CAPEITEM_FW_BRIDGEWATCH_3_0_request("", "Лист5_4!B24"),		
		T8_CAPEITEM_FW_BRIDGEWATCH_4_0_request("", "Лист5_4!B25"),		
		
		T8_CAPEITEM_FW_BRIDGEWATCH_1_1_1_request("", "Лист5_4!B26"),
		T8_CAPEITEM_FW_BRIDGEWATCH_1_2_1_request("", "Лист5_4!B27"),
		T8_CAPEITEM_FW_BRIDGEWATCH_1_3_1_request("", "Лист5_4!B28"),
		T8_CAPEITEM_FW_BRIDGEWATCH_1_4_1_request("", "Лист5_4!B29"),
		
		T8_CAPEITEM_FW_BRIDGEWATCH_2_1_2_request("", "Лист5_4!B30"),
		T8_CAPEITEM_FW_BRIDGEWATCH_2_2_2_request("", "Лист5_4!B31"),
		T8_CAPEITEM_FW_BRIDGEWATCH_2_3_2_request("", "Лист5_4!B32"),
		T8_CAPEITEM_FW_BRIDGEWATCH_2_4_2_request("", "Лист5_4!B33"),
		
		T8_CAPEITEM_FW_BRIDGEWATCH_3_1_3_request("", "Лист5_4!B34"),
		T8_CAPEITEM_FW_BRIDGEWATCH_3_2_3_request("", "Лист5_4!B35"),
		T8_CAPEITEM_FW_BRIDGEWATCH_3_3_3_request("", "Лист5_4!B36"),
		T8_CAPEITEM_FW_BRIDGEWATCH_3_4_3_request("", "Лист5_4!B37"),
		
		
		T8_CAPEITEM_FW_FORTSTERLING_1_0_offer("Лист5_4!F5"),		//Накидка знатока FortSterling
		T8_CAPEITEM_FW_FORTSTERLING_2_0_offer("Лист5_4!F6"),		
		T8_CAPEITEM_FW_FORTSTERLING_3_0_offer("Лист5_4!F7"),		
		T8_CAPEITEM_FW_FORTSTERLING_4_0_offer("Лист5_4!F8"),		
		
		T8_CAPEITEM_FW_FORTSTERLING_1_1_1_offer("Лист5_4!F9"),
		T8_CAPEITEM_FW_FORTSTERLING_1_2_1_offer("Лист5_4!F10"),
		T8_CAPEITEM_FW_FORTSTERLING_1_3_1_offer("Лист5_4!F11"),
		T8_CAPEITEM_FW_FORTSTERLING_1_4_1_offer("Лист5_4!F12"),
		
		T8_CAPEITEM_FW_FORTSTERLING_2_1_2_offer("Лист5_4!F13"),
		T8_CAPEITEM_FW_FORTSTERLING_2_2_2_offer("Лист5_4!F14"),
		T8_CAPEITEM_FW_FORTSTERLING_2_3_2_offer("Лист5_4!F15"),
		T8_CAPEITEM_FW_FORTSTERLING_2_4_2_offer("Лист5_4!F16"),
		
		T8_CAPEITEM_FW_FORTSTERLING_3_1_3_offer("Лист5_4!F17"),
		T8_CAPEITEM_FW_FORTSTERLING_3_2_3_offer("Лист5_4!F18"),
		T8_CAPEITEM_FW_FORTSTERLING_3_3_3_offer("Лист5_4!F19"),
		T8_CAPEITEM_FW_FORTSTERLING_3_4_3_offer("Лист5_4!F20"),
		
		T8_CAPEITEM_FW_FORTSTERLING_1_0_request("", "Лист5_4!F22"),		
		T8_CAPEITEM_FW_FORTSTERLING_2_0_request("", "Лист5_4!F23"),		
		T8_CAPEITEM_FW_FORTSTERLING_3_0_request("", "Лист5_4!F24"),		
		T8_CAPEITEM_FW_FORTSTERLING_4_0_request("", "Лист5_4!F25"),		
		
		T8_CAPEITEM_FW_FORTSTERLING_1_1_1_request("", "Лист5_4!F26"),
		T8_CAPEITEM_FW_FORTSTERLING_1_2_1_request("", "Лист5_4!F27"),
		T8_CAPEITEM_FW_FORTSTERLING_1_3_1_request("", "Лист5_4!F28"),
		T8_CAPEITEM_FW_FORTSTERLING_1_4_1_request("", "Лист5_4!F29"),
		
		T8_CAPEITEM_FW_FORTSTERLING_2_1_2_request("", "Лист5_4!F30"),
		T8_CAPEITEM_FW_FORTSTERLING_2_2_2_request("", "Лист5_4!F31"),
		T8_CAPEITEM_FW_FORTSTERLING_2_3_2_request("", "Лист5_4!F32"),
		T8_CAPEITEM_FW_FORTSTERLING_2_4_2_request("", "Лист5_4!F33"),
		
		T8_CAPEITEM_FW_FORTSTERLING_3_1_3_request("", "Лист5_4!F34"),
		T8_CAPEITEM_FW_FORTSTERLING_3_2_3_request("", "Лист5_4!F35"),
		T8_CAPEITEM_FW_FORTSTERLING_3_3_3_request("", "Лист5_4!F36"),
		T8_CAPEITEM_FW_FORTSTERLING_3_4_3_request("", "Лист5_4!F37"),
		
		T8_CAPEITEM_FW_LYMHURST_1_0_offer("Лист5_4!J5"),		//Накидка знатока Lymhurst
		T8_CAPEITEM_FW_LYMHURST_2_0_offer("Лист5_4!J6"),		
		T8_CAPEITEM_FW_LYMHURST_3_0_offer("Лист5_4!J7"),		
		T8_CAPEITEM_FW_LYMHURST_4_0_offer("Лист5_4!J8"),		
		
		T8_CAPEITEM_FW_LYMHURST_1_1_1_offer("Лист5_4!J9"),
		T8_CAPEITEM_FW_LYMHURST_1_2_1_offer("Лист5_4!J10"),
		T8_CAPEITEM_FW_LYMHURST_1_3_1_offer("Лист5_4!J11"),
		T8_CAPEITEM_FW_LYMHURST_1_4_1_offer("Лист5_4!J12"),
		
		T8_CAPEITEM_FW_LYMHURST_2_1_2_offer("Лист5_4!J13"),
		T8_CAPEITEM_FW_LYMHURST_2_2_2_offer("Лист5_4!J14"),
		T8_CAPEITEM_FW_LYMHURST_2_3_2_offer("Лист5_4!J15"),
		T8_CAPEITEM_FW_LYMHURST_2_4_2_offer("Лист5_4!J16"),
		
		T8_CAPEITEM_FW_LYMHURST_3_1_3_offer("Лист5_4!J17"),
		T8_CAPEITEM_FW_LYMHURST_3_2_3_offer("Лист5_4!J18"),
		T8_CAPEITEM_FW_LYMHURST_3_3_3_offer("Лист5_4!J19"),
		T8_CAPEITEM_FW_LYMHURST_3_4_3_offer("Лист5_4!J20"),
		
		T8_CAPEITEM_FW_LYMHURST_1_0_request("", "Лист5_4!J22"),		
		T8_CAPEITEM_FW_LYMHURST_2_0_request("", "Лист5_4!J23"),		
		T8_CAPEITEM_FW_LYMHURST_3_0_request("", "Лист5_4!J24"),		
		T8_CAPEITEM_FW_LYMHURST_4_0_request("", "Лист5_4!J25"),		
		
		T8_CAPEITEM_FW_LYMHURST_1_1_1_request("", "Лист5_4!J26"),
		T8_CAPEITEM_FW_LYMHURST_1_2_1_request("", "Лист5_4!J27"),
		T8_CAPEITEM_FW_LYMHURST_1_3_1_request("", "Лист5_4!J28"),
		T8_CAPEITEM_FW_LYMHURST_1_4_1_request("", "Лист5_4!J29"),
		
		T8_CAPEITEM_FW_LYMHURST_2_1_2_request("", "Лист5_4!J30"),
		T8_CAPEITEM_FW_LYMHURST_2_2_2_request("", "Лист5_4!J31"),
		T8_CAPEITEM_FW_LYMHURST_2_3_2_request("", "Лист5_4!J32"),
		T8_CAPEITEM_FW_LYMHURST_2_4_2_request("", "Лист5_4!J33"),
		
		T8_CAPEITEM_FW_LYMHURST_3_1_3_request("", "Лист5_4!J34"),
		T8_CAPEITEM_FW_LYMHURST_3_2_3_request("", "Лист5_4!J35"),
		T8_CAPEITEM_FW_LYMHURST_3_3_3_request("", "Лист5_4!J36"),
		T8_CAPEITEM_FW_LYMHURST_3_4_3_request("", "Лист5_4!J37"),
		
		T8_CAPEITEM_FW_MARTLOCK_1_0_offer("Лист5_4!N5"),		//Накидка знатока Martlock
		T8_CAPEITEM_FW_MARTLOCK_2_0_offer("Лист5_4!N6"),		
		T8_CAPEITEM_FW_MARTLOCK_3_0_offer("Лист5_4!N7"),		
		T8_CAPEITEM_FW_MARTLOCK_4_0_offer("Лист5_4!N8"),		
		
		T8_CAPEITEM_FW_MARTLOCK_1_1_1_offer("Лист5_4!N9"),
		T8_CAPEITEM_FW_MARTLOCK_1_2_1_offer("Лист5_4!N10"),
		T8_CAPEITEM_FW_MARTLOCK_1_3_1_offer("Лист5_4!N11"),
		T8_CAPEITEM_FW_MARTLOCK_1_4_1_offer("Лист5_4!N12"),
		
		T8_CAPEITEM_FW_MARTLOCK_2_1_2_offer("Лист5_4!N13"),
		T8_CAPEITEM_FW_MARTLOCK_2_2_2_offer("Лист5_4!N14"),
		T8_CAPEITEM_FW_MARTLOCK_2_3_2_offer("Лист5_4!N15"),
		T8_CAPEITEM_FW_MARTLOCK_2_4_2_offer("Лист5_4!N16"),
		
		T8_CAPEITEM_FW_MARTLOCK_3_1_3_offer("Лист5_4!N17"),
		T8_CAPEITEM_FW_MARTLOCK_3_2_3_offer("Лист5_4!N18"),
		T8_CAPEITEM_FW_MARTLOCK_3_3_3_offer("Лист5_4!N19"),
		T8_CAPEITEM_FW_MARTLOCK_3_4_3_offer("Лист5_4!N20"),
		
		T8_CAPEITEM_FW_MARTLOCK_1_0_request("", "Лист5_4!N22"),		
		T8_CAPEITEM_FW_MARTLOCK_2_0_request("", "Лист5_4!N23"),		
		T8_CAPEITEM_FW_MARTLOCK_3_0_request("", "Лист5_4!N24"),		
		T8_CAPEITEM_FW_MARTLOCK_4_0_request("", "Лист5_4!N25"),		
		
		T8_CAPEITEM_FW_MARTLOCK_1_1_1_request("", "Лист5_4!N26"),
		T8_CAPEITEM_FW_MARTLOCK_1_2_1_request("", "Лист5_4!N27"),
		T8_CAPEITEM_FW_MARTLOCK_1_3_1_request("", "Лист5_4!N28"),
		T8_CAPEITEM_FW_MARTLOCK_1_4_1_request("", "Лист5_4!N29"),
		
		T8_CAPEITEM_FW_MARTLOCK_2_1_2_request("", "Лист5_4!N30"),
		T8_CAPEITEM_FW_MARTLOCK_2_2_2_request("", "Лист5_4!N31"),
		T8_CAPEITEM_FW_MARTLOCK_2_3_2_request("", "Лист5_4!N32"),
		T8_CAPEITEM_FW_MARTLOCK_2_4_2_request("", "Лист5_4!N33"),
		
		T8_CAPEITEM_FW_MARTLOCK_3_1_3_request("", "Лист5_4!N34"),
		T8_CAPEITEM_FW_MARTLOCK_3_2_3_request("", "Лист5_4!N35"),
		T8_CAPEITEM_FW_MARTLOCK_3_3_3_request("", "Лист5_4!N36"),
		T8_CAPEITEM_FW_MARTLOCK_3_4_3_request("", "Лист5_4!N37"),
		
		T8_CAPEITEM_FW_THETFORD_1_0_offer("Лист5_4!R5"),		//Накидка знатока Therford
		T8_CAPEITEM_FW_THETFORD_2_0_offer("Лист5_4!R6"),		
		T8_CAPEITEM_FW_THETFORD_3_0_offer("Лист5_4!R7"),		
		T8_CAPEITEM_FW_THETFORD_4_0_offer("Лист5_4!R8"),		
		
		T8_CAPEITEM_FW_THETFORD_1_1_1_offer("Лист5_4!R9"),
		T8_CAPEITEM_FW_THETFORD_1_2_1_offer("Лист5_4!R10"),
		T8_CAPEITEM_FW_THETFORD_1_3_1_offer("Лист5_4!R11"),
		T8_CAPEITEM_FW_THETFORD_1_4_1_offer("Лист5_4!R12"),
		
		T8_CAPEITEM_FW_THETFORD_2_1_2_offer("Лист5_4!R13"),
		T8_CAPEITEM_FW_THETFORD_2_2_2_offer("Лист5_4!R14"),
		T8_CAPEITEM_FW_THETFORD_2_3_2_offer("Лист5_4!R15"),
		T8_CAPEITEM_FW_THETFORD_2_4_2_offer("Лист5_4!R16"),
		
		T8_CAPEITEM_FW_THETFORD_3_1_3_offer("Лист5_4!R17"),
		T8_CAPEITEM_FW_THETFORD_3_2_3_offer("Лист5_4!R18"),
		T8_CAPEITEM_FW_THETFORD_3_3_3_offer("Лист5_4!R19"),
		T8_CAPEITEM_FW_THETFORD_3_4_3_offer("Лист5_4!R20"),
		
		T8_CAPEITEM_FW_THETFORD_1_0_request("", "Лист5_4!R22"),		
		T8_CAPEITEM_FW_THETFORD_2_0_request("", "Лист5_4!R23"),		
		T8_CAPEITEM_FW_THETFORD_3_0_request("", "Лист5_4!R24"),		
		T8_CAPEITEM_FW_THETFORD_4_0_request("", "Лист5_4!R25"),		
		
		T8_CAPEITEM_FW_THETFORD_1_1_1_request("", "Лист5_4!R26"),
		T8_CAPEITEM_FW_THETFORD_1_2_1_request("", "Лист5_4!R27"),
		T8_CAPEITEM_FW_THETFORD_1_3_1_request("", "Лист5_4!R28"),
		T8_CAPEITEM_FW_THETFORD_1_4_1_request("", "Лист5_4!R29"),
		
		T8_CAPEITEM_FW_THETFORD_2_1_2_request("", "Лист5_4!R30"),
		T8_CAPEITEM_FW_THETFORD_2_2_2_request("", "Лист5_4!R31"),
		T8_CAPEITEM_FW_THETFORD_2_3_2_request("", "Лист5_4!R32"),
		T8_CAPEITEM_FW_THETFORD_2_4_2_request("", "Лист5_4!R33"),
		
		T8_CAPEITEM_FW_THETFORD_3_1_3_request("", "Лист5_4!R34"),
		T8_CAPEITEM_FW_THETFORD_3_2_3_request("", "Лист5_4!R35"),
		T8_CAPEITEM_FW_THETFORD_3_3_3_request("", "Лист5_4!R36"),
		T8_CAPEITEM_FW_THETFORD_3_4_3_request("", "Лист5_4!R37"),
		
		T8_CAPEITEM_FW_CAERLEON_1_0_offer("Лист5_4!V5"),		//Плащ города Caerleon
		T8_CAPEITEM_FW_CAERLEON_2_0_offer("Лист5_4!V6"),		
		T8_CAPEITEM_FW_CAERLEON_3_0_offer("Лист5_4!V7"),		
		T8_CAPEITEM_FW_CAERLEON_4_0_offer("Лист5_4!V8"),		
		
		T8_CAPEITEM_FW_CAERLEON_1_1_1_offer("Лист5_4!V9"),
		T8_CAPEITEM_FW_CAERLEON_1_2_1_offer("Лист5_4!V10"),
		T8_CAPEITEM_FW_CAERLEON_1_3_1_offer("Лист5_4!V11"),
		T8_CAPEITEM_FW_CAERLEON_1_4_1_offer("Лист5_4!V12"),
		
		T8_CAPEITEM_FW_CAERLEON_2_1_2_offer("Лист5_4!V13"),
		T8_CAPEITEM_FW_CAERLEON_2_2_2_offer("Лист5_4!V14"),
		T8_CAPEITEM_FW_CAERLEON_2_3_2_offer("Лист5_4!V15"),
		T8_CAPEITEM_FW_CAERLEON_2_4_2_offer("Лист5_4!V16"),
		
		T8_CAPEITEM_FW_CAERLEON_3_1_3_offer("Лист5_4!V17"),
		T8_CAPEITEM_FW_CAERLEON_3_2_3_offer("Лист5_4!V18"),
		T8_CAPEITEM_FW_CAERLEON_3_3_3_offer("Лист5_4!V19"),
		T8_CAPEITEM_FW_CAERLEON_3_4_3_offer("Лист5_4!V20"),
		
		T8_CAPEITEM_FW_CAERLEON_1_0_request("", "Лист5_4!V22"),		
		T8_CAPEITEM_FW_CAERLEON_2_0_request("", "Лист5_4!V23"),		
		T8_CAPEITEM_FW_CAERLEON_3_0_request("", "Лист5_4!V24"),		
		T8_CAPEITEM_FW_CAERLEON_4_0_request("", "Лист5_4!V25"),		
		
		T8_CAPEITEM_FW_CAERLEON_1_1_1_request("", "Лист5_4!V26"),
		T8_CAPEITEM_FW_CAERLEON_1_2_1_request("", "Лист5_4!V27"),
		T8_CAPEITEM_FW_CAERLEON_1_3_1_request("", "Лист5_4!V28"),
		T8_CAPEITEM_FW_CAERLEON_1_4_1_request("", "Лист5_4!V29"),
		
		T8_CAPEITEM_FW_CAERLEON_2_1_2_request("", "Лист5_4!V30"),
		T8_CAPEITEM_FW_CAERLEON_2_2_2_request("", "Лист5_4!V31"),
		T8_CAPEITEM_FW_CAERLEON_2_3_2_request("", "Лист5_4!V32"),
		T8_CAPEITEM_FW_CAERLEON_2_4_2_request("", "Лист5_4!V33"),
		
		T8_CAPEITEM_FW_CAERLEON_3_1_3_request("", "Лист5_4!V34"),
		T8_CAPEITEM_FW_CAERLEON_3_2_3_request("", "Лист5_4!V35"),
		T8_CAPEITEM_FW_CAERLEON_3_3_3_request("", "Лист5_4!V36"),
		T8_CAPEITEM_FW_CAERLEON_3_4_3_request("", "Лист5_4!V37"),
		
		T8_CAPEITEM_HERETIC_1_0_offer("Лист5_4!Z5"),		//Плащ еретиков
		T8_CAPEITEM_HERETIC_2_0_offer("Лист5_4!Z6"),		
		T8_CAPEITEM_HERETIC_3_0_offer("Лист5_4!Z7"),		
		T8_CAPEITEM_HERETIC_4_0_offer("Лист5_4!Z8"),		
		
		T8_CAPEITEM_HERETIC_1_1_1_offer("Лист5_4!Z9"),
		T8_CAPEITEM_HERETIC_1_2_1_offer("Лист5_4!Z10"),
		T8_CAPEITEM_HERETIC_1_3_1_offer("Лист5_4!Z11"),
		T8_CAPEITEM_HERETIC_1_4_1_offer("Лист5_4!Z12"),
		
		T8_CAPEITEM_HERETIC_2_1_2_offer("Лист5_4!Z13"),
		T8_CAPEITEM_HERETIC_2_2_2_offer("Лист5_4!Z14"),
		T8_CAPEITEM_HERETIC_2_3_2_offer("Лист5_4!Z15"),
		T8_CAPEITEM_HERETIC_2_4_2_offer("Лист5_4!Z16"),
		
		T8_CAPEITEM_HERETIC_3_1_3_offer("Лист5_4!Z17"),
		T8_CAPEITEM_HERETIC_3_2_3_offer("Лист5_4!Z18"),
		T8_CAPEITEM_HERETIC_3_3_3_offer("Лист5_4!Z19"),
		T8_CAPEITEM_HERETIC_3_4_3_offer("Лист5_4!Z20"),
		
		T8_CAPEITEM_HERETIC_1_0_request("", "Лист5_4!Z22"),		
		T8_CAPEITEM_HERETIC_2_0_request("", "Лист5_4!Z23"),		
		T8_CAPEITEM_HERETIC_3_0_request("", "Лист5_4!Z24"),		
		T8_CAPEITEM_HERETIC_4_0_request("", "Лист5_4!Z25"),		
		
		T8_CAPEITEM_HERETIC_1_1_1_request("", "Лист5_4!Z26"),
		T8_CAPEITEM_HERETIC_1_2_1_request("", "Лист5_4!Z27"),
		T8_CAPEITEM_HERETIC_1_3_1_request("", "Лист5_4!Z28"),
		T8_CAPEITEM_HERETIC_1_4_1_request("", "Лист5_4!Z29"),
		
		T8_CAPEITEM_HERETIC_2_1_2_request("", "Лист5_4!Z30"),
		T8_CAPEITEM_HERETIC_2_2_2_request("", "Лист5_4!Z31"),
		T8_CAPEITEM_HERETIC_2_3_2_request("", "Лист5_4!Z32"),
		T8_CAPEITEM_HERETIC_2_4_2_request("", "Лист5_4!Z33"),
		
		T8_CAPEITEM_HERETIC_3_1_3_request("", "Лист5_4!Z34"),
		T8_CAPEITEM_HERETIC_3_2_3_request("", "Лист5_4!Z35"),
		T8_CAPEITEM_HERETIC_3_3_3_request("", "Лист5_4!Z36"),
		T8_CAPEITEM_HERETIC_3_4_3_request("", "Лист5_4!Z37"),
		
		T8_CAPEITEM_UNDEAD_1_0_offer("Лист5_4!AD5"),		//Плащ Нежити
		T8_CAPEITEM_UNDEAD_2_0_offer("Лист5_4!AD6"),		
		T8_CAPEITEM_UNDEAD_3_0_offer("Лист5_4!AD7"),		
		T8_CAPEITEM_UNDEAD_4_0_offer("Лист5_4!AD8"),		
		
		T8_CAPEITEM_UNDEAD_1_1_1_offer("Лист5_4!AD9"),
		T8_CAPEITEM_UNDEAD_1_2_1_offer("Лист5_4!AD10"),
		T8_CAPEITEM_UNDEAD_1_3_1_offer("Лист5_4!AD11"),
		T8_CAPEITEM_UNDEAD_1_4_1_offer("Лист5_4!AD12"),
		
		T8_CAPEITEM_UNDEAD_2_1_2_offer("Лист5_4!AD13"),
		T8_CAPEITEM_UNDEAD_2_2_2_offer("Лист5_4!AD14"),
		T8_CAPEITEM_UNDEAD_2_3_2_offer("Лист5_4!AD15"),
		T8_CAPEITEM_UNDEAD_2_4_2_offer("Лист5_4!AD16"),
		
		T8_CAPEITEM_UNDEAD_3_1_3_offer("Лист5_4!AD17"),
		T8_CAPEITEM_UNDEAD_3_2_3_offer("Лист5_4!AD18"),
		T8_CAPEITEM_UNDEAD_3_3_3_offer("Лист5_4!AD19"),
		T8_CAPEITEM_UNDEAD_3_4_3_offer("Лист5_4!AD20"),
		
		T8_CAPEITEM_UNDEAD_1_0_request("", "Лист5_4!AD22"),		
		T8_CAPEITEM_UNDEAD_2_0_request("", "Лист5_4!AD23"),		
		T8_CAPEITEM_UNDEAD_3_0_request("", "Лист5_4!AD24"),		
		T8_CAPEITEM_UNDEAD_4_0_request("", "Лист5_4!AD25"),		
		
		T8_CAPEITEM_UNDEAD_1_1_1_request("", "Лист5_4!AD26"),
		T8_CAPEITEM_UNDEAD_1_2_1_request("", "Лист5_4!AD27"),
		T8_CAPEITEM_UNDEAD_1_3_1_request("", "Лист5_4!AD28"),
		T8_CAPEITEM_UNDEAD_1_4_1_request("", "Лист5_4!AD29"),
		
		T8_CAPEITEM_UNDEAD_2_1_2_request("", "Лист5_4!AD30"),
		T8_CAPEITEM_UNDEAD_2_2_2_request("", "Лист5_4!AD31"),
		T8_CAPEITEM_UNDEAD_2_3_2_request("", "Лист5_4!AD32"),
		T8_CAPEITEM_UNDEAD_2_4_2_request("", "Лист5_4!AD33"),
		
		T8_CAPEITEM_UNDEAD_3_1_3_request("", "Лист5_4!AD34"),
		T8_CAPEITEM_UNDEAD_3_2_3_request("", "Лист5_4!AD35"),
		T8_CAPEITEM_UNDEAD_3_3_3_request("", "Лист5_4!AD36"),
		T8_CAPEITEM_UNDEAD_3_4_3_request("", "Лист5_4!AD37"),
		
		T8_CAPEITEM_KEEPER_1_0_offer("Лист5_4!AH5"),		//Плащ Хранителей
		T8_CAPEITEM_KEEPER_2_0_offer("Лист5_4!AH6"),		
		T8_CAPEITEM_KEEPER_3_0_offer("Лист5_4!AH7"),		
		T8_CAPEITEM_KEEPER_4_0_offer("Лист5_4!AH8"),		
		
		T8_CAPEITEM_KEEPER_1_1_1_offer("Лист5_4!AH9"),
		T8_CAPEITEM_KEEPER_1_2_1_offer("Лист5_4!AH10"),
		T8_CAPEITEM_KEEPER_1_3_1_offer("Лист5_4!AH11"),
		T8_CAPEITEM_KEEPER_1_4_1_offer("Лист5_4!AH12"),
		
		T8_CAPEITEM_KEEPER_2_1_2_offer("Лист5_4!AH13"),
		T8_CAPEITEM_KEEPER_2_2_2_offer("Лист5_4!AH14"),
		T8_CAPEITEM_KEEPER_2_3_2_offer("Лист5_4!AH15"),
		T8_CAPEITEM_KEEPER_2_4_2_offer("Лист5_4!AH16"),
		
		T8_CAPEITEM_KEEPER_3_1_3_offer("Лист5_4!AH17"),
		T8_CAPEITEM_KEEPER_3_2_3_offer("Лист5_4!AH18"),
		T8_CAPEITEM_KEEPER_3_3_3_offer("Лист5_4!AH19"),
		T8_CAPEITEM_KEEPER_3_4_3_offer("Лист5_4!AH20"),
		
		T8_CAPEITEM_KEEPER_1_0_request("", "Лист5_4!AH22"),		
		T8_CAPEITEM_KEEPER_2_0_request("", "Лист5_4!AH23"),		
		T8_CAPEITEM_KEEPER_3_0_request("", "Лист5_4!AH24"),		
		T8_CAPEITEM_KEEPER_4_0_request("", "Лист5_4!AH25"),		
		
		T8_CAPEITEM_KEEPER_1_1_1_request("", "Лист5_4!AH26"),
		T8_CAPEITEM_KEEPER_1_2_1_request("", "Лист5_4!AH27"),
		T8_CAPEITEM_KEEPER_1_3_1_request("", "Лист5_4!AH28"),
		T8_CAPEITEM_KEEPER_1_4_1_request("", "Лист5_4!AH29"),
		
		T8_CAPEITEM_KEEPER_2_1_2_request("", "Лист5_4!AH30"),
		T8_CAPEITEM_KEEPER_2_2_2_request("", "Лист5_4!AH31"),
		T8_CAPEITEM_KEEPER_2_3_2_request("", "Лист5_4!AH32"),
		T8_CAPEITEM_KEEPER_2_4_2_request("", "Лист5_4!AH33"),
		
		T8_CAPEITEM_KEEPER_3_1_3_request("", "Лист5_4!AH34"),
		T8_CAPEITEM_KEEPER_3_2_3_request("", "Лист5_4!AH35"),
		T8_CAPEITEM_KEEPER_3_3_3_request("", "Лист5_4!AH36"),
		T8_CAPEITEM_KEEPER_3_4_3_request("", "Лист5_4!AH37"),
		
		T8_CAPEITEM_MORGANA_1_0_offer("Лист5_4!AL5"),		//Плащ морганы
		T8_CAPEITEM_MORGANA_2_0_offer("Лист5_4!AL6"),		
		T8_CAPEITEM_MORGANA_3_0_offer("Лист5_4!AL7"),		
		T8_CAPEITEM_MORGANA_4_0_offer("Лист5_4!AL8"),		
		
		T8_CAPEITEM_MORGANA_1_1_1_offer("Лист5_4!AL9"),
		T8_CAPEITEM_MORGANA_1_2_1_offer("Лист5_4!AL10"),
		T8_CAPEITEM_MORGANA_1_3_1_offer("Лист5_4!AL11"),
		T8_CAPEITEM_MORGANA_1_4_1_offer("Лист5_4!AL12"),
		
		T8_CAPEITEM_MORGANA_2_1_2_offer("Лист5_4!AL13"),
		T8_CAPEITEM_MORGANA_2_2_2_offer("Лист5_4!AL14"),
		T8_CAPEITEM_MORGANA_2_3_2_offer("Лист5_4!AL15"),
		T8_CAPEITEM_MORGANA_2_4_2_offer("Лист5_4!AL16"),
		
		T8_CAPEITEM_MORGANA_3_1_3_offer("Лист5_4!AL17"),
		T8_CAPEITEM_MORGANA_3_2_3_offer("Лист5_4!AL18"),
		T8_CAPEITEM_MORGANA_3_3_3_offer("Лист5_4!AL19"),
		T8_CAPEITEM_MORGANA_3_4_3_offer("Лист5_4!AL20"),
		
		T8_CAPEITEM_MORGANA_1_0_request("", "Лист5_4!AL22"),		
		T8_CAPEITEM_MORGANA_2_0_request("", "Лист5_4!AL23"),		
		T8_CAPEITEM_MORGANA_3_0_request("", "Лист5_4!AL24"),		
		T8_CAPEITEM_MORGANA_4_0_request("", "Лист5_4!AL25"),		
		
		T8_CAPEITEM_MORGANA_1_1_1_request("", "Лист5_4!AL26"),
		T8_CAPEITEM_MORGANA_1_2_1_request("", "Лист5_4!AL27"),
		T8_CAPEITEM_MORGANA_1_3_1_request("", "Лист5_4!AL28"),
		T8_CAPEITEM_MORGANA_1_4_1_request("", "Лист5_4!AL29"),
		
		T8_CAPEITEM_MORGANA_2_1_2_request("", "Лист5_4!AL30"),
		T8_CAPEITEM_MORGANA_2_2_2_request("", "Лист5_4!AL31"),
		T8_CAPEITEM_MORGANA_2_3_2_request("", "Лист5_4!AL32"),
		T8_CAPEITEM_MORGANA_2_4_2_request("", "Лист5_4!AL33"),
		
		T8_CAPEITEM_MORGANA_3_1_3_request("", "Лист5_4!AL34"),
		T8_CAPEITEM_MORGANA_3_2_3_request("", "Лист5_4!AL35"),
		T8_CAPEITEM_MORGANA_3_3_3_request("", "Лист5_4!AL36"),
		T8_CAPEITEM_MORGANA_3_4_3_request("", "Лист5_4!AL37"),
		
		T8_CAPEITEM_DEMON_1_0_offer("Лист5_4!AP5"),		//Плащ демонов
		T8_CAPEITEM_DEMON_2_0_offer("Лист5_4!AP6"),		
		T8_CAPEITEM_DEMON_3_0_offer("Лист5_4!AP7"),		
		T8_CAPEITEM_DEMON_4_0_offer("Лист5_4!AP8"),		
		
		T8_CAPEITEM_DEMON_1_1_1_offer("Лист5_4!AP9"),
		T8_CAPEITEM_DEMON_1_2_1_offer("Лист5_4!AP10"),
		T8_CAPEITEM_DEMON_1_3_1_offer("Лист5_4!AP11"),
		T8_CAPEITEM_DEMON_1_4_1_offer("Лист5_4!AP12"),
		
		T8_CAPEITEM_DEMON_2_1_2_offer("Лист5_4!AP13"),
		T8_CAPEITEM_DEMON_2_2_2_offer("Лист5_4!AP14"),
		T8_CAPEITEM_DEMON_2_3_2_offer("Лист5_4!AP15"),
		T8_CAPEITEM_DEMON_2_4_2_offer("Лист5_4!AP16"),
		
		T8_CAPEITEM_DEMON_3_1_3_offer("Лист5_4!AP17"),
		T8_CAPEITEM_DEMON_3_2_3_offer("Лист5_4!AP18"),
		T8_CAPEITEM_DEMON_3_3_3_offer("Лист5_4!AP19"),
		T8_CAPEITEM_DEMON_3_4_3_offer("Лист5_4!AP20"),
		
		T8_CAPEITEM_DEMON_1_0_request("", "Лист5_4!AP22"),		
		T8_CAPEITEM_DEMON_2_0_request("", "Лист5_4!AP23"),		
		T8_CAPEITEM_DEMON_3_0_request("", "Лист5_4!AP24"),		
		T8_CAPEITEM_DEMON_4_0_request("", "Лист5_4!AP25"),		
		
		T8_CAPEITEM_DEMON_1_1_1_request("", "Лист5_4!AP26"),
		T8_CAPEITEM_DEMON_1_2_1_request("", "Лист5_4!AP27"),
		T8_CAPEITEM_DEMON_1_3_1_request("", "Лист5_4!AP28"),
		T8_CAPEITEM_DEMON_1_4_1_request("", "Лист5_4!AP29"),
		
		T8_CAPEITEM_DEMON_2_1_2_request("", "Лист5_4!AP30"),
		T8_CAPEITEM_DEMON_2_2_2_request("", "Лист5_4!AP31"),
		T8_CAPEITEM_DEMON_2_3_2_request("", "Лист5_4!AP32"),
		T8_CAPEITEM_DEMON_2_4_2_request("", "Лист5_4!AP33"),
		
		T8_CAPEITEM_DEMON_3_1_3_request("", "Лист5_4!AP34"),
		T8_CAPEITEM_DEMON_3_2_3_request("", "Лист5_4!AP35"),
		T8_CAPEITEM_DEMON_3_3_3_request("", "Лист5_4!AP36"),
		T8_CAPEITEM_DEMON_3_4_3_request("", "Лист5_4!AP37"),
		
		
		T8_CAPEITEM_FW_BRECILIEN_1_0_offer("Лист5_4!AT5"),		//Плащ города brecilien
		T8_CAPEITEM_FW_BRECILIEN_2_0_offer("Лист5_4!AT6"),		
		T8_CAPEITEM_FW_BRECILIEN_3_0_offer("Лист5_4!AT7"),		
		T8_CAPEITEM_FW_BRECILIEN_4_0_offer("Лист5_4!AT8"),		
		
		T8_CAPEITEM_FW_BRECILIEN_1_1_1_offer("Лист5_4!AT9"),
		T8_CAPEITEM_FW_BRECILIEN_1_2_1_offer("Лист5_4!AT10"),
		T8_CAPEITEM_FW_BRECILIEN_1_3_1_offer("Лист5_4!AT11"),
		T8_CAPEITEM_FW_BRECILIEN_1_4_1_offer("Лист5_4!AT12"),
		
		T8_CAPEITEM_FW_BRECILIEN_2_1_2_offer("Лист5_4!AT13"),
		T8_CAPEITEM_FW_BRECILIEN_2_2_2_offer("Лист5_4!AT14"),
		T8_CAPEITEM_FW_BRECILIEN_2_3_2_offer("Лист5_4!AT15"),
		T8_CAPEITEM_FW_BRECILIEN_2_4_2_offer("Лист5_4!AT16"),
		
		T8_CAPEITEM_FW_BRECILIEN_3_1_3_offer("Лист5_4!AT17"),
		T8_CAPEITEM_FW_BRECILIEN_3_2_3_offer("Лист5_4!AT18"),
		T8_CAPEITEM_FW_BRECILIEN_3_3_3_offer("Лист5_4!AT19"),
		T8_CAPEITEM_FW_BRECILIEN_3_4_3_offer("Лист5_4!AT20"),
		
		T8_CAPEITEM_FW_BRECILIEN_1_0_request("", "Лист5_4!AT22"),		
		T8_CAPEITEM_FW_BRECILIEN_2_0_request("", "Лист5_4!AT23"),		
		T8_CAPEITEM_FW_BRECILIEN_3_0_request("", "Лист5_4!AT24"),		
		T8_CAPEITEM_FW_BRECILIEN_4_0_request("", "Лист5_4!AT25"),		
		
		T8_CAPEITEM_FW_BRECILIEN_1_1_1_request("", "Лист5_4!AT26"),
		T8_CAPEITEM_FW_BRECILIEN_1_2_1_request("", "Лист5_4!AT27"),
		T8_CAPEITEM_FW_BRECILIEN_1_3_1_request("", "Лист5_4!AT28"),
		T8_CAPEITEM_FW_BRECILIEN_1_4_1_request("", "Лист5_4!AT29"),
		
		T8_CAPEITEM_FW_BRECILIEN_2_1_2_request("", "Лист5_4!AT30"),
		T8_CAPEITEM_FW_BRECILIEN_2_2_2_request("", "Лист5_4!AT31"),
		T8_CAPEITEM_FW_BRECILIEN_2_3_2_request("", "Лист5_4!AT32"),
		T8_CAPEITEM_FW_BRECILIEN_2_4_2_request("", "Лист5_4!AT33"),
		
		T8_CAPEITEM_FW_BRECILIEN_3_1_3_request("", "Лист5_4!AT34"),
		T8_CAPEITEM_FW_BRECILIEN_3_2_3_request("", "Лист5_4!AT35"),
		T8_CAPEITEM_FW_BRECILIEN_3_3_3_request("", "Лист5_4!AT36"),
		T8_CAPEITEM_FW_BRECILIEN_3_4_3_request("", "Лист5_4!AT37"),
		
		;
		
		private String minRqCellInTable;
		private String maxRqCellInTable;
		private String avgRqCellInTable;

		private String minOfferCellInTable;
		private String maxOfferCellInTable;
		private String avgOfferCellInTable;

		private int qualityLevel;
		private int enchantmentLevel;
		private String auctionType;
		
	    private static final Map<String,Item> map;
	    static {
	        map = new HashMap<String,Item>();
	        for (Item v : Item.values()) {
	            map.put(v.name(), v);
	        }
	    }
	    public static Item findByKey(String key) {
	        return map.get(key);
	    }
		
		Item(String minOfferCellInTable){
			this.minOfferCellInTable = minOfferCellInTable;
		}
		
		Item(String minOfferCellInTable, String maxRqCellInTable){
			this.maxRqCellInTable = maxRqCellInTable;
			this.minOfferCellInTable = minOfferCellInTable;
		}
		
		public String minRqCellInTable() {
			return minRqCellInTable;
		}
		
		public String maxRqCellInTable() {
			return maxRqCellInTable;
		}
		
		public String avgRqCellInTable() {
			return avgRqCellInTable;
		}
		
		public String minOfferCellInTable() {
			return minOfferCellInTable;
		}
		
		public String maxOfferCellInTable() {
			return maxOfferCellInTable;
		}
		
		public String avgOfferCellInTable() {
			return avgOfferCellInTable;
		}
		
		public int qualityLevel() {
			return qualityLevel;
		}
		
		public int enchantmentLevel() {
			return enchantmentLevel;
		}
		
		public String auctionType() {
			return auctionType;
		}
	}
}
