import UIKit
import WebKit

class ViewController: UIViewController {
    @IBOutlet weak var webView: WKWebView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        loadWebsite()
    }
    
    func loadWebsite() {
        if let url = URL(string: "[Add your Website URL here]") {
            let request = URLRequest(url: url)
            webView.load(request)
        } else {
            print("Error: Invalid URL")
        }
    }
}

