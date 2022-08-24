package com.src.spicy.SpicyBot.ChatBotLogic;

import java.io.IOException;

import javax.enterprise.context.RequestScoped;

import com.src.spicy.SpicyBot.SlackConnect.SlackConnection;
import com.src.spicy.SpicyBot.WordList.RyoujiPowerWordList1;

@RequestScoped
public class ChatBotWordLogic {
	
	SlackConnection slackConnection = new SlackConnection();
	
	public ChatBotWordLogic() {
		
	}
	
	public String Service(String inputWord) throws IOException {
		String Response = discriminationWord(inputWord);
		
		return null;
	}
	
	private String discriminationWord(String inputWord) throws IOException {
		
		String Message;
		
		String[] randomWord = {"おはようございます。", "今日の予定は？", "怒らせないでね？", "疲れたとか関係ないからね？", "ちゃんと計画立てろよ？", "そんなの知らないよ！自分で考えなよ？",
				"1週間くらい休暇とったら？", "知らないよ？後で出来ませんでしたとか許さないからね？", "今一生懸命やらないと後で後悔するよー？", "いい加減ステップアップしてください！",
				"もうやめよう！あなたじゃ無理だから！", "辛辣of辛辣", "なにそれ？"};
		
		switch(inputWord) {
			case "【辛辣Bot】、もう限界です。":
				Message =  RyoujiPowerWordList1.Word1;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、もう帰らせてください。":
				Message = RyoujiPowerWordList1.Word2;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、無理です。出来ません。":
				Message = RyoujiPowerWordList1.Word5;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、無理":
				Message = RyoujiPowerWordList1.Word21;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、できません":
				Message = RyoujiPowerWordList1.Word30;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、無理です。":
				Message = RyoujiPowerWordList1.Word43;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、終わりません。":
				Message = RyoujiPowerWordList1.Word40;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、出来ませんでした":
				Message = RyoujiPowerWordList1.Word3;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、できませんでした":
				Message = RyoujiPowerWordList1.Word3;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、帰らせてください":
				Message = RyoujiPowerWordList1.Word2;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、かえらせてください":
				Message = RyoujiPowerWordList1.Word2;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、それパワハラですよ？":
				Message = RyoujiPowerWordList1.Word46;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、パラハラ":
				Message = RyoujiPowerWordList1.Word34;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、定時までに終わりませんでした。":
				Message = RyoujiPowerWordList1.Word6;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、ソースコード":
				Message = RyoujiPowerWordList1.Word4;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、ソースコードを見てください。":
				Message = RyoujiPowerWordList1.Word4;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、プロダクションコード":
				Message = RyoujiPowerWordList1.Word7;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、ios":
				Message = RyoujiPowerWordList1.Word8;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、IOS":
				Message = RyoujiPowerWordList1.Word8;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、API":
				Message = RyoujiPowerWordList1.Word9;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、BFF":
				Message = RyoujiPowerWordList1.Word9;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、もう出来ません！":
				Message = RyoujiPowerWordList1.Word10;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、もうできません":
				Message = RyoujiPowerWordList1.Word10;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、さっきまで動いていたんですけど":
				Message = RyoujiPowerWordList1.Word11;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、この前まで問題なく動いていました！":
				Message = RyoujiPowerWordList1.Word11;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、出来ます！":
				Message = RyoujiPowerWordList1.Word12;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、できます!":
				Message = RyoujiPowerWordList1.Word12;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、出来ます":
				Message = RyoujiPowerWordList1.Word12;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、できます":
				Message = RyoujiPowerWordList1.Word12;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、調査しておきました":
				Message = RyoujiPowerWordList1.Word13;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、調査しておきました！":
				Message = RyoujiPowerWordList1.Word13;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、調査しておきました。":
				Message = RyoujiPowerWordList1.Word13;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、もう辞めます！":
				Message = RyoujiPowerWordList1.Word14;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、辞めます":
				Message = RyoujiPowerWordList1.Word14;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、このような結果になりました。":
				Message = RyoujiPowerWordList1.Word12;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、本番環境指示通り調査しました。":
				Message = RyoujiPowerWordList1.Word13;
				slackConnection.Service(Message);
				break;
			case  "【辛辣Bot】、諦めます。":
				Message = RyoujiPowerWordList1.Word15;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、何ですか？それ？":
				Message = RyoujiPowerWordList1.Word16;
				slackConnection.Service(Message);
				break;
			case  "【辛辣Bot】、おはようございます。":
				Message = RyoujiPowerWordList1.Word17;
				slackConnection.Service(Message);
				break;
			case "【辛辣Bot】、・・・":
				Message = RyoujiPowerWordList1.Word18;
				slackConnection.Service(Message);
				break;
			
			default:
				int num = (int)(Math.random() * (randomWord.length));
				Message = randomWord[num];
				slackConnection.Service(Message);
		}
		return null;
		
	}

}
