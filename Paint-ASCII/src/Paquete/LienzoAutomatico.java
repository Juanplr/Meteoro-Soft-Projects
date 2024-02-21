/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;

/**
 *
 * @author reyes
 */
public class LienzoAutomatico extends Lienzo {

    private String lienzo;

    public LienzoAutomatico(int largo, int ancho) {
        super(largo, ancho);
    }

    @Override
    public void crearLienzo() {
        String[] lienzoarrray = new String[20];

        lienzoarrray[0]
                = "       _____  \n"
                + "      /  ___  \\\n"
                + "    /  /  _  \\  \\\n"
                + "  /( /( /(_)\\ )\\ )\\\n"
                + " (  \\  \\ ___ /  /  )\n"
                + " (    \\ _____ /    )\n"
                + " /(               )\\\n"
                + "|  \\             /  |\n"
                + "|    \\ _______ /    |\n"
                + " \\    / \\   / \\    /\n"
                + "   \\/    | |    \\/\n"
                + "         | | \n"
                + "         | |\n"
                + "         | |";

        lienzoarrray[1] = ""
                + ",;;;;;;;;;;;.\n"
                + " ,;;;;;;;;;`````)\n"
                + ",;;;;;;;;'    (@)               ,',\n"
                + ";;;;;;;;')       \\               ,\n"
                + ";;;;;;;;_}       _)            ',\n"
                + ";;;;;;'        _;_______________\n"
                + "`;;;;;        ;_.---------------'\n"
                + "  `;;;         (\n"
                + "    `;.        )";
        lienzoarrray[3] = "  |_|_|\n"
                + "      \\_|||;;_/\n"
                + "     \\d||%||%:b/               |_|_|\n"
                + "    \\d~|dO%|i::b/            \\_|||;;_/\n"
                + "  ._H||dSf|||%::H_.         \\d|||||;:b/\n"
                + "  ._H@|dLF|}|;::H_.        \\d||#H#|;::b/\n"
                + "  ._H||dXFt||;.:H_.      ._H||#H#|||;::H_.   \n"
                + "  ._?|{|P|||/;:.P_.      ._H||#H#|||;::H_.\n"
                + "   ._Hy||t|||;:H_.       ._H||#H#|||;::H_.\n"
                + "   ._?|x||T|;i:P_.       ._?|||#||||;::P_.\n"
                + "    ._H||i||;:H_.         ._H|||||||;:H_.\n"
                + "    ._H|\"|||;:H_.         ._?||||||;::P_.\n"
                + " .=================.       ._H|||||;:H_.\n"
                + " |;;|#H#|;;;;;;;;: |       ._H|||||;:H_.\n"
                + " .=================.    .=================.\n"
                + "  |;|#H#|;;;;;;;: |     |_________________|\n"
                + "   |;|#H#|;;;;;: |       |               |\n"
                + "   |;|#H#|;;;;;: |        |             |\n"
                + "    |;|#H#|;;;: |         |             |\n"
                + "    |;|#H#|;;;: |          |           |\n"
                + "     |;|#H#|;: |           |           |\n"
                + "      =========             |_________|";
        lienzoarrray[4] = "            ,-._\n"
                + "           _.-'  '--.\n"
                + "         .'      _  -`\\_\n"
                + "        / .----.`_.'----'\n"
                + "        ;/     `\n"
                + "       /_;\n"
                + "\n"
                + "    ._      ._      ._      ._\n"
                + "_.-._)`\\_.-._)`\\_.-._)`\\_.-._)`\\_.-._";
        lienzoarrray[5] = " _._     _,-'\"\"`-._\n"
                + "(,-.`._,'(       |\\`-/|\n"
                + "    `-.-' \\ )-`( , o o)\n"
                + "          `-    \\`_`\"'-";
        lienzoarrray[6] = "(\"`-''-/\").___..--''\"`-._ \n"
                + " `6_ 6  )   `-.  (     ).`-.__.`) \n"
                + " (_Y_.)'  ._   )  `._ `. ``-..-' \n"
                + "   _..`--'_..-_/  /--'_.'\n"
                + "  ((((.-''  ((((.'  (((.-' ";
        lienzoarrray[7] = " _________         .    .\n"
                + "(..       \\_    ,  |\\  /|\n"
                + " \\       O  \\  /|  \\ \\/ /\n"
                + "  \\______    \\/ |   \\  / \n"
                + "     vvvv\\    \\ |   /  |\n"
                + "     \\^^^^  ==   \\_/   |\n"
                + "      `\\_   ===    \\.  |\n"
                + "      / /\\_   \\ /      |\n"
                + "      |/   \\_  \\|      /\n"
                + " snd         \\________/";
        lienzoarrray[8] = " sjw       ..----.._    _\n"
                + "            .' .--.    \"-.(O)_\n"
                + "'-.__.-'\"'=:|  ,  _)_ \\__ . c\\'-..\n"
                + "             ''------'---''---'-\"";
        lienzoarrray[9] = "######################################################################################\n"
                + "#                                                                                    # \n"
                + "#                            ,.--------._                                            #\n"
                + "#                           /            ''.                                         #\n"
                + "#                         ,'                \\     |\"\\                /\\          /\\  #\n"
                + "#                /\"|     /                   \\    |__\"              ( \\\\        // ) #\n"
                + "#               \"_\"|    /           z#####z   \\  //                  \\ \\\\      // /  #\n"
                + "#                 \\\\  #####        ##------\".  \\//                    \\_\\\\||||//_/   #\n"
                + "#                  \\\\/-----\\     /          \".  \\                      \\/ _  _ \\     #\n"
                + "#                   \\|      \\   |   ,,--..       \\                    \\/|(O)(O)|     #\n"
                + "#                   | ,.--._ \\  (  | ##   \\)      \\                  \\/ |      |     #\n"
                + "#                   |(  ##  )/   \\ `-....-//       |///////////////_\\/  \\      /     #\n"
                + "#                     '--'.\"      \\                \\              //     |____|      #\n"
                + "#                  /'    /         ) --.            \\            ||     /      \\     #\n"
                + "#               ,..|     \\.________/    `-..         \\   \\       \\|     \\ 0  0 /     #\n"
                + "#            _,##/ |   ,/   /   \\           \\         \\   \\       U    / \\_//_/      #\n"
                + "#          :###.-  |  ,/   /     \\        /' \"\"\\      .\\        (     /              #\n"
                + "#         /####|   |   (.___________,---',/    |       |\\=._____|  |_/               #\n"
                + "#        /#####|   |     \\__|__|__|__|_,/             |####\\    |  ||                #\n"
                + "#       /######\\   \\      \\__________/                /#####|   \\  ||                #\n"
                + "#      /|#######`. `\\                                /#######\\   | ||                #\n"
                + "#     /++\\#########\\  \\                      _,'    _/#########\\ | ||                #\n"
                + "#    /++++|#########|  \\      .---..       ,/      ,'##########.\\|_||  Donkey By     #\n"
                + "#   //++++|#########\\.  \\.              ,-/      ,'########,+++++\\\\_\\\\ Hard'96       #\n"
                + "#  /++++++|##########\\.   '._        _,/       ,'######,''++++++++\\                  #\n"
                + "# |+++++++|###########|       -----.\"        _'#######' +++++++++++\\                 #\n"
                + "# |+++++++|############\\.     \\\\     //      /#######/++++ S@yaN +++\\                #\n"
                + "#      ________________________\\\\___//______________________________________         #\n"
                + "#     / ____________________________________________________________________)        #\n"
                + "#    / /              _                                             _                #\n"
                + "#    | |             | |                                           | |               #\n"
                + "#     \\ \\            | | _           ____           ____           | |  _            #\n"
                + "#      \\ \\           | || \\         / ___)         / _  )          | | / )           #\n"
                + "#  _____) )          | | | |        | |           (  __ /          | |< (            #\n"
                + "# (______/           |_| |_|        |_|            \\_____)         |_| \\_)           #\n"
                + "#                                                                           19.08.02 #\n"
                + "######################################################################################";
        lienzoarrray[10] = "                  .-.\n"
                + "                      |_:_|\n"
                + "                     /(_Y_)\\\n"
                + ".                   ( \\/M\\/ )\n"
                + " '.               _.'-/'-'\\-'._\n"
                + "   ':           _/.--'[[[[]'--.\\_\n"
                + "     ':        /_'  : |::\"| :  '.\\\n"
                + "       ':     //   ./ |oUU| \\.'  :\\\n"
                + "         ':  _:'..' \\_|___|_/ :   :|\n"
                + "           ':.  .'  |_[___]_|  :.':\\\n"
                + "            [::\\ |  :  | |  :   ; : \\\n"
                + "             '-'   \\/'.| |.' \\  .;.' |\n"
                + "             |\\_    \\  '-'   :       |\n"
                + "             |  \\    \\ .:    :   |   |\n"
                + "             |   \\    | '.   :    \\  |\n"
                + "             /       \\   :. .;       |\n"
                + "            /     |   |  :__/     :  \\\\\n"
                + "           |  |   |    \\:   | \\   |   ||\n"
                + "          /    \\  : :  |:   /  |__|   /|\n"
                + "      snd |     : : :_/_|  /'._\\  '--|_\\\n"
                + "          /___.-/_|-'   \\  \\\n"
                + "                         '-'";
        lienzoarrray[11] = "-\"'\"-.\n"
                + "             |       |  \n"
                + "           (`-._____.-')\n"
                + "        ..  `-._____.-'  ..\n"
                + "      .', :./'.== ==.`\\.: ,`.\n"
                + "     : (  :   ___ ___   :  ) ;\n"
                + "     '._.:    |0| |0|    :._.'\n"
                + "        /     `-'_`-'     \\\n"
                + "      _.|       / \\       |._\n"
                + "    .'.-|      (   )      |-.`.\n"
                + "   //'  |  .-\"`\"`-'\"`\"-.  |  `\\\\ \n"
                + "  ||    |  `~\":-...-:\"~`  |    ||\n"
                + "  ||     \\.    `---'    ./     ||\n"
                + "  ||       '-._     _.-'       ||\n"
                + " /  \\       _/ `~:~` \\_       /  \\\n"
                + "||||\\)   .-'    / \\    `-.   (/||||\n"
                + "\\|||    (`.___.')-(`.___.')    |||/\n"
                + " '\"' jgs `-----'   `-----'     '\"'";
        lienzoarrray[12] = ".-\"\".   _____   .\"\"-.\n"
                + " //.==.\\ (*****) /.==.\\\\\n"
                + ";//:::'||,;;;;;,||.:::\\\\;\n"
                + "||::::.\\((((/\\)))/.::::||\n"
                + "||:::.  )))a a(((  .:::||\n"
                + "||:::. (((  ^  ))) ':::||\n"
                + "||::.   )))-^-(((  .:::||\n"
                + "||::'  (((\\\\_//)))  .::||\n"
                + "||::. /    \\_/    \\ '::||\n"
                + "||:: /             \\ ::||\n"
                + "||::/   |       |   \\::||\n"
                + "||:/    ;       ;    \\:||\n"
                + "||/      }===o={      \\||\n"
                + "|`-,_   ;    (  ;   _,-'|\n"
                + "||(_/'._|     ) |_.'\\_)||\n"
                + "||::.  ||    (  ||  .::||\n"
                + "||::. / |     ) | \\ '::||\n"
                + "||:' |  |       |  | .:||\n"
                + "||::/   |       |   \\::||\n"
                + ";|:|    |       |    |:|;\n"
                + " \\/     |       |     \\/\n"
                + "    jgs |       |\n"
                + "        |:.:.:.:|\n"
                + "        :':':':':";
        lienzoarrray[13] = "              _.--\"\"`-..\n"
                + "            ,'          `.\n"
                + "          ,'          __  `.\n"
                + "         /|          \" __   \\\n"
                + "        , |           / |.   .\n"
                + "        |,'          !_.'|   |\n"
                + "      ,'             '   |   |\n"
                + "     /              |`--'|   |\n"
                + "    |                `---'   |\n"
                + "     .   ,                   |                       ,\".\n"
                + "      ._     '           _'  |                    , ' \\ `\n"
                + "  `.. `.`-...___,...---\"\"    |       __,.        ,`\"   L,|\n"
                + "  |, `- .`._        _,-,.'   .  __.-'-. /        .   ,    \\\n"
                + "-:..     `. `-..--_.,.<       `\"      / `.        `-/ |   .\n"
                + "  `,         \"\"\"\"'     `.              ,'         |   |  ',,\n"
                + "    `.      '            '            /          '    |'. |/\n"
                + "      `.   |              \\       _,-'           |       ''\n"
                + "        `._'               \\   '\"\\                .      |\n"
                + "           |                '     \\                `._  ,'\n"
                + "           |                 '     \\                 .'|\n"
                + "           |                 .      \\                | |\n"
                + "           |                 |       L              ,' |\n"
                + "           `                 |       |             /   '\n"
                + "            \\                |       |           ,'   /\n"
                + "          ,' \\               |  _.._ ,-..___,..-'    ,'\n"
                + "         /     .             .      `!             ,j'\n"
                + "        /       `.          /        .           .'/\n"
                + "       .          `.       /         |        _.'.'\n"
                + "        `.          7`'---'          |------\"'_.'\n"
                + "       _,.`,_     _'                ,''-----\"'\n"
                + "   _,-_    '       `.     .'      ,\\\n"
                + "   -\" /`.         _,'     | _  _  _.|\n"
                + "    \"\"--'---\"\"\"\"\"'        `' '! |! /\n"
                + "                            `\" \" -' mh";
        lienzoarrray[14] = " T\\ T\\\n"
                + "                | \\| \\\n"
                + "                |  |  :\n"
                + "           _____I__I  |\n"
                + "         .'            '.\n"
                + "       .'                '\n"
                + "       |   ..             '\n"
                + "       |  /__.            |\n"
                + "       :.' -'             |\n"
                + "      /__.                |\n"
                + "     /__, \\               |\n"
                + "        |__\\        _|    |\n"
                + "        :  '\\     .'|     |\n"
                + "        |___|_,,,/  |     |    _..--.\n"
                + "     ,--_-   |     /'      \\../ /  /\\\\\n"
                + "    ,'|_ I---|    7    ,,,_/ / ,  / _\\\\\n"
                + "  ,-- 7 \\|  / ___..,,/   /  ,  ,_/   '-----.\n"
                + " /   ,   \\  |/  ,____,,,__,,__/            '\\\n"
                + ",   ,     \\__,,/                             |\n"
                + "| '.       _..---.._                         !.\n"
                + "! |      .' z_M__s. '.                        |\n"
                + ".:'      | (-_ _--')  :          L            !\n"
                + ".'.       '.  Y    _.'             \\,         :\n"
                + " .          '-----'                 !          .\n"
                + " .           /  \\                   .          .";
        lienzoarrray[15] = "        __,__\n"
                + "        .--.  .-\"     \"-.  .--.\n"
                + "       / .. \\/  .-. .-.  \\/ .. \\\n"
                + "      | |  '|  /   Y   \\  |'  | |\n"
                + "      | \\   \\  \\ 0 | 0 /  /   / |\n"
                + "       \\ '- ,\\.-\"`` ``\"-./, -' /\n"
                + "        `'-' /_   ^ ^   _\\ '-'`\n"
                + "        .--'|  \\._ _ _./  |'--. \n"
                + "      /`    \\   \\.-.  /   /    `\\\n"
                + "     /       '._/  |-' _.'       \\\n"
                + "    /          ;  /--~'   |       \\\n"
                + "   /        .'\\|.-\\--.     \\       \\\n"
                + "  /   .'-. /.-.;\\  |\\|'~'-.|\\       \\\n"
                + "  \\       `-./`|_\\_/ `     `\\'.      \\\n"
                + "   '.      ;     ___)        '.`;    /\n"
                + "     '-.,_ ;     ___)          \\/   /\n"
                + "      \\   ``'------'\\       \\   `  /\n"
                + "       '.    \\       '.      |   ;/_\n"
                + "jgs  ___>     '.       \\_ _ _/   ,  '--.\n"
                + "   .'   '.   .-~~~~~-. /     |--'`~~-.  \\\n"
                + "  // / .---'/  .-~~-._/ / / /---..__.'  /\n"
                + " ((_(_/    /  /      (_(_(_(---.__    .'\n"
                + "           | |     _              `~~`\n"
                + "           | |     \\'.\n"
                + "            \\ '....' |\n"
                + "             '.,___.'";
        lienzoarrray[16] = "  `|.                                       \n"
                + " |:\\-,              .| \\.\n"
                + " |: `.------------------------------------.\n"
                + " / /   o o o o o o o o o o o o o.-.o o   (_`. \n"
                + "/_ \\_              .     .=     |'|         `)  \n"
                + "     ``\"\"\"\"\"\"\"\"\"\"\"//    /  \"\"\"\"\" `\"\"\"------\"'";
        lienzoarrray[17] = " _____    \n"
                + "/  _/\\\\  \n"
                + "| / oo\n"
                + "\\(   _\\\n"
                + " \\  O/\n"
                + " /   \\\n"
                + " ||  ||\n"
                + " ||  ||      \"Hmmmmmmmm...\"\n"
                + " ||  || _____ /\n"
                + " | \\ ||(___  )\n"
                + "// / \\|_)o (  )\n"
                + "\\\\ ///|)\\_(    )\n"
                + " ||   |\\ )(    )\n"
                + " ||   ) \\/(____)_     ___\n"
                + " ||   |\\___/     `---' `.`.\n"
                + " ||   | :   _       .'   ))\n"
                + " ||   | `..' `~~~-.'   .'__ _\n"
                + " \\\\  /           '.______  ( (\n"
                + " ((___ooO                `._\\_\\ jro";
        lienzoarrray[18] = "     _..-----._\n"
                + "                  .'          '.\n"
                + "                 /              \\\n"
                + "                |                ;\n"
                + "                |                 |\n"
                + "                \\                 |\n"
                + "                 \\               ;\n"
                + "           _..----'             /\n"
                + "         .`-. .-'``'-.       .-'\n"
                + "       .'_   `  _     '.    `'.\n"
                + "      /  _`    _ `      \\      \\     _...._\n"
                + "   _  | /  \\  /  \\      |       | .-'      `'.\n"
                + "  / \\ | | /|  | /|      |       ;'            \\\n"
                + " |  |_\\ \\_|/  \\_|/      /                      ;\n"
                + " .\\_/  `'-.            /_...._                 |\n"
                + "/          `                  `\\               |\n"
                + "|                        __     |             /\n"
                + " \\                       / `   //'.         .'\n"
                + "  '._                  .'     .'   `'-...-'`\n"
                + "     `\"'-.,__    ___.-'    .-'\n"
                + "    jgs  `-._````  __..--'`\n"
                + "             ``````";
        lienzoarrray[19] = "   __\n"
                + "    .-'  |\n"
                + "   /   <\\|\n"
                + "  /     \\'\n"
                + "  |_.- o-o\n"
                + "  / C  -._)\\\n"
                + " /',        |\n"
                + "|   `-,_,__,'\n"
                + "(,,)====[_]=|\n"
                + "  '.   ____/\n"
                + "   | -|-|_\n"
                + "   |____)_) [n4biS]";

        Random random = new Random();
        int numrandom = random.nextInt(19);
        lienzo = lienzoarrray[numrandom];
        System.out.println("Tamañno del liezoarray es: ´" + lienzoarrray[numrandom].length());
        System.out.println("Tamaño del lienzo es: " + lienzo.length());
        System.out.println(lienzo);
    }

    @Override
    public boolean pintar() {

        return false;

    }

    @Override
    public void LimpiarConsola() {

    }

    @Override
    public void mostrarLienzo() {
        crearLienzo();
    }

    @Override
    public boolean exportar() {
        File archivo = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try{
			archivo = new File("./"+nombre+".txt");
			fw = new FileWriter(archivo);
			bw = new BufferedWriter(fw);
                       for(int i = 1; i<100; i++){
                                bw.write(lienzo);
                            bw.write("\n");
                        }
			bw.flush();
			fw.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
        return false;

    }

    @Override
    public boolean eliminarC() {

        return false;

    }

}
