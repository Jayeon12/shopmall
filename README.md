# 🛍 JSPベースショッピングモールWebアプリケーション

Java ServletとJSPを使用して構築されたシンプルなショッピングモールWebアプリです。  
商品一覧、詳細表示、一部のカート機能が実装されています。

---

## 🔧 使用技術
- Java（JDK 11以上）
- JSP / Servlet
- HTML, CSS（Bootstrap）
- Apache Tomcat 9
- Eclipse（Dynamic Web Project）

---

## 📁 プロジェクト構成
```
Shoppingdog/
├── WebContent/ # 静的リソース（JSP、CSS、画像など）
│ ├── css/
│ ├── images/
│ ├── WEB-INF/
│ │ ├── web.xml # Tomcatのデプロイ設定
│ │ └── lib/ # ライブラリ（JARファイル）
│ ├── welcome.jsp # メインページ
│ └── ...
├── src/ # Javaソースコード（Servlet、DAO、DTO）
```


> ※ 現時点ではTomcatのポート競合などによりローカルでの実行が困難な状態です。  
> プロジェクト構成とコード自体は完成しており、設定を調整すれば実行可能です。

---

## 🚀 実行手順
1. Eclipseでプロジェクトをインポート  
   `File > Import > Existing Projects into Workspace`

2. Tomcatサーバーを関連付け  
   `プロジェクト > プロパティ > Targeted Runtimes > Tomcat をチェック`

3. servlet-apiライブラリを追加  
   `プロジェクト > プロパティ > Java Build Path > ライブラリ追加 > Server Runtime > Apache Tomcat 9`

4. サーバーで実行（Run on Server）  
   アクセス例：  
   `http://localhost:8080/Shoppingdog/welcome.jsp`

---

## 💡 主な機能
- 商品一覧ページ（products.jsp）
- 商品詳細ページ（product.jsp）
- カートに商品追加機能
- ファイルアップロード（cos.jar、commons-io含む）

---

## 📌 備考
- データベース連携なし（セッションで簡易カート機能を実装）
- デザインはBootstrapを使用したレスポンシブ構成
