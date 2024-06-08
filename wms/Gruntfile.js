module.exports = function (grunt) {
	'use strict';

	var moment = (require('moment'))();
	var saveLicense = require('uglify-save-license');

	var setNodeModules = grunt.option('setNodeModules');
	var cwd;

	if (setNodeModules) {
		cwd = process.cwd();
		process.chdir(setNodeModules);
		process.chdir('..');
	}

	// プラグインのロード
	grunt.loadNpmTasks('grunt-ngdocs');
	grunt.loadNpmTasks('grunt-contrib-connect');
	grunt.loadNpmTasks('grunt-contrib-clean');
	grunt.loadNpmTasks('grunt-contrib-copy');
	grunt.loadNpmTasks('grunt-contrib-uglify');
	grunt.loadNpmTasks('grunt-contrib-cssmin');
	grunt.loadNpmTasks('grunt-contrib-htmlmin');
	grunt.loadNpmTasks('grunt-contrib-concat');
	grunt.loadNpmTasks('grunt-usemin');
	grunt.loadNpmTasks('grunt-cache-breaker');
	grunt.loadNpmTasks('grunt-htmlhint-plus');
	grunt.loadNpmTasks('grunt-contrib-jshint');

	if (setNodeModules) {
		process.chdir(cwd);
	}

	grunt.initConfig({
		//ファイルのコピー
		copy: {
			WEBINF: {
				expand: true,
				cwd: 'WebContents/WEB-INF/',
				src: ['**/*.*'],
				dest: 'dist/WEB-INF/'
			},
			METAINF: {
				expand: true,
				cwd: 'WebContents/META-INF/',
				src: ['**/*.*'],
				dest: 'dist/META-INF/'
			},
			jsp: {
				expand: true,
				cwd: 'WebContents/',
				src: ['*.jsp','*.html'],
				dest: 'dist/'
			},
			base : {
				expand: true,
				cwd: 'WebContents/base/',
				src: ['**/*.*'],
				dest: 'dist/base/'
			},
			audio : {
				expand: true,
				cwd: 'WebContents/wms/audio',
				src: ['**/*.*'],
				dest: 'dist/wms/audio'
			},
			LICENSE : {
				expand: true,
				cwd: 'WebContents/base/',
				src: ['**/LICENSE'],
				dest: 'dist/base/'
			}
		},

		// jsファイル結合と圧縮の設定
		uglify: {
			wms: {
				options: {
					mangle: false
				},
				files: {
					// [ver.2.2.0] 2016/03/02 inoue Start
					// [ver.2.2.0] 以下の書き方だとSD版とPC版が混在した状態になる 2016/03/02 inoue
//					'dist/wms/js/oneslogi.wms.assist.min.js':['WebContents/wms/js/assist/*.js'],
//					'dist/wms/js/oneslogi.wms.common.min.js':['WebContents/wms/js/common/*.js'],
//					'dist/wms/js/oneslogi.wms.daily.min.js':['WebContents/wms/js/daily/*.js'],
//					'dist/wms/js/oneslogi.wms.inventory.min.js':['WebContents/wms/js/inventory/*.js'],
//					'dist/wms/js/oneslogi.wms.master.min.js':['WebContents/wms/js/master/*.js'],
//					'dist/wms/js/oneslogi.wms.receive.min.js':['WebContents/wms/js/receive/*.js'],
//					'dist/wms/js/oneslogi.wms.shipping.min.js':['WebContents/wms/js/shipping/*.js'],
//					'dist/wms/js/oneslogi.wms.ecorder.min.js':['WebContents/wms/js/ecorder/*.js'],
//					'dist/wms/js/oneslogi.wms.stock.min.js':['WebContents/wms/js/stock/*.js']

					// [ver.2.2.0] PC版向けの定義 2016/03/02 inoue
					'dist/wms/js/oneslogi.wms.assist.min.js':['WebContents/wms/js/assist/*.js', '!WebContents/wms/js/assist/*.sd.js', '!WebContents/wms/js/assist/*SD.js']
					, 'dist/wms/js/oneslogi.wms.common.min.js':['WebContents/wms/js/common/*.js', '!WebContents/wms/js/common/*.sd.js', '!WebContents/wms/js/common/*SD.js']
					, 'dist/wms/js/oneslogi.wms.daily.min.js':['WebContents/wms/js/daily/*.js', '!WebContents/wms/js/daily/*.sd.js', '!WebContents/wms/js/daily/*SD.js']
					, 'dist/wms/js/oneslogi.wms.inventory.min.js':['WebContents/wms/js/inventory/*.js', '!WebContents/wms/js/inventory/*.sd.js', '!WebContents/wms/js/inventory/*SD.js']
					, 'dist/wms/js/oneslogi.wms.master.min.js':['WebContents/wms/js/master/*.js', '!WebContents/wms/js/master/*.sd.js', '!WebContents/wms/js/master/*SD.js']
					, 'dist/wms/js/oneslogi.wms.receive.min.js':['WebContents/wms/js/receive/*.js', '!WebContents/wms/js/receive/*.sd.js', '!WebContents/wms/js/receive/*SD.js']
					, 'dist/wms/js/oneslogi.wms.shipping.min.js':['WebContents/wms/js/shipping/*.js', '!WebContents/wms/js/shipping/*.sd.js', '!WebContents/wms/js/shipping/*SD.js']
					, 'dist/wms/js/oneslogi.wms.ecorder.min.js':['WebContents/wms/js/ecorder/*.js', '!WebContents/wms/js/ecorder/*.sd.js', '!WebContents/wms/js/ecorder/*SD.js']
					, 'dist/wms/js/oneslogi.wms.stock.min.js':['WebContents/wms/js/stock/*.js', '!WebContents/wms/js/stock/*.sd.js', '!WebContents/wms/js/stock/*SD.js']

					// [ver.2.2.0] SD版向けの定義 2016/03/02 inoue
					// [ver.2.2.0] 対象がない場合はminファイルは作成されないので、とりあえず全部のサブシステム分の定義を作っておく。 2016/03/02 inoue
					, 'dist/wms/js/oneslogi.wms.assist.sd.min.js':['WebContents/wms/js/assist/*.sd.js', 'WebContents/wms/js/assist/*SD.js']
					, 'dist/wms/js/oneslogi.wms.common.sd.min.js':['WebContents/wms/js/common/*.sd.js', 'WebContents/wms/js/common/*SD.js']
					, 'dist/wms/js/oneslogi.wms.daily.sd.min.js':['WebContents/wms/js/daily/*.sd.js', 'WebContents/wms/js/daily/*SD.js']
					, 'dist/wms/js/oneslogi.wms.inventory.sd.min.js':['WebContents/wms/js/inventory/*.sd.js', 'WebContents/wms/js/inventory/*SD.js']
					, 'dist/wms/js/oneslogi.wms.master.sd.min.js':['WebContents/wms/js/master/*.sd.js', 'WebContents/wms/js/master/*SD.js']
					, 'dist/wms/js/oneslogi.wms.receive.sd.min.js':['WebContents/wms/js/receive/*.sd.js', 'WebContents/wms/js/receive/*SD.js']
					, 'dist/wms/js/oneslogi.wms.shipping.sd.min.js':['WebContents/wms/js/shipping/*.sd.js', 'WebContents/wms/js/shipping/*SD.js']
					, 'dist/wms/js/oneslogi.wms.ecorder.sd.min.js':['WebContents/wms/js/ecorder/*.sd.js', 'WebContents/wms/js/ecorder/*SD.js']
					, 'dist/wms/js/oneslogi.wms.stock.sd.min.js':['WebContents/wms/js/stock/*.sd.js', 'WebContents/wms/js/stock/*SD.js']
					// [ver.2.2.0] 2016/03/02 inoue End

					// [基盤分離対応] 機能 #1011 oneslogi.wms.jsの分離 2016/03/02 inoue Start
					, 'dist/wms/js/oneslogi.wms.depends.min.js':['WebContents/wms/js/oneslogi.wms.depends.js']
					// [基盤分離対応] 機能 #1011 oneslogi.wms.jsの分離 2016/03/02 inoue End
					// [ONEsLOGI 労務管理][#6067] 運用におけるミニファイ化するファイル指定を追加 2019.02.26 shimizu Start
					, 'dist/wms/js/oneslogi.wms.operation.min.js':['WebContents/wms/js/operation/*.js']
					, 'dist/wms/js/oneslogi.wms.simple.depends.min.js':['WebContents/wms/js/oneslogi.wms.simple.depends.js']
					// [ONEsLOGI 労務管理][#6067] 運用におけるミニファイ化するファイル指定を追加 2019.02.26 shimizu Start
				}
			}
		},
		//cssファイル結合と圧縮の設定
		cssmin: {
			wms: {
				options: {
					noAdvanced: true
				},
				files: {
					'dist/wms/css/wms-common.min.css':['WebContents/wms/css/wms-common.css']
				}
			}
		},

		// htmlファイルの圧縮の設定
		htmlmin: {
			rootJsp: {
				options: {
					removeComments: true,
					collapseWhitespace: false,
					removeRedundantAttributes: false,
					removeOptionalTags: false,
					ignoreCustomFragments: [ /<%[\s\S]*?%>/, /<\?[\s\S]*?\?>/, /<jsp:[\s\S]*?>/ ] 
					},
				expand: true,
				cwd: 'dist',
				src: ['*.jsp'],
				dest: 'dist'
			},
			rootHtml: {
				options: {
					removeComments: true,
					collapseWhitespace: false,
					removeRedundantAttributes: false,
					removeOptionalTags: false
					},
				expand: true,
				cwd: 'dist',
				src: ['*.html'],
				dest: 'dist'
			},
			wms: {
				options: {
					removeComments: true,
					collapseWhitespace: false,
					removeRedundantAttributes: false,
					removeOptionalTags: false
					},
				expand: true,
				cwd: 'WebContents/wms/partials',
				src: ['**/*.html'],
				dest: 'dist/wms/partials'
			}
		},

		// 本番用ファイルへ変更設定
		usemin: {
			// jspはindex.jsp以外も対象とする。2015/10/21 inoue
			//html: ['dist/index.jsp', 'dist/*.html'],
			html: ['dist/*.jsp', 'dist/*.html'],
			options: {
				dirs: 'dist/'
			}
		},

		// 本番用JSPのjsとcssをキャッシュさせないようにタイムスタンプを付ける
		cachebreaker: {
			dist: {
				options: {
					match: [
						'css',
// jsだとjspのincludeも書き換わるため、min.jsに変更。2015/10/21 inoue
//						'js'
						'min.js'
					],
					replacement: function() {
						return moment.format('YYYYMMDDHHmmss');
					}
				},
				files: {
					src:[
//jspはindex.jsp以外も対象とする。htmlも対象とする。2015/10/21 inoue
//						'dist/index.jsp'
						'dist/*.jsp',
						'dist/*.html'
					]
				}
			}
		},

		//nodeのサーバ設定
		connect: {
			options: {
				keepalive: true
			},
			server: {}
		},

		// クリーンナップ設定
		clean: {
			doc: {
				files:[{
					dot: true,
					src: 'WebContents/docs/'
				}]
			},
			build: {
				files: [{
					dot: true,
					src: 'dist/'
				}]
			},
			buildfinally: {
				files: [{
					src: 'dist/WEB-INF/lib/servlet-api.jar'
				}]
			},
			// wmsのwebリソースのみの削除(検証用) 2017/03/02 inoue
			wms: {
				files: [{
					dot: true,
					src: 'dist/wms/'
				}]
			},
		},

		htmlhintplus: {
			html: {
				options: {
					rules: {
						'tag-pair': true,
						'tagname-lowercase': true,
						'attr-lowercase': true,
						'attr-value-double-quotes': true,
						'attr-value-not-empty': false,
						'attr-no-duplication': true,
						'doctype-first': false,
						'tag-pair': true,
						'tag-self-close': false,
						'spec-char-escape': true,
						'id-unique': true,
						'src-not-empty': true,
						'head-script-disabled': true,
						'img-alt-require': true,
						'doctype-html5': true,
						'id-class-value': '',
						'style-disabled': false,
						'space-tab-mixed-disabled': false,
						'id-class-ad-disabled': true,
						'href-abs-or-rel': true,
						'attr-unsafe-chars': true
					},
					newer: false
				},
				src: 'WebContents/wms/partials/**/*.html'
			}
		},
		jshint: {
			options: {
				jshintrc: '.jshintrc'
			},
			files: {
				src: 'WebContents/wms/js/**/*.js'
			}
		}
	});

	grunt.registerTask('default', ['clean:doc', 'ngdocs', 'connect']);
	grunt.registerTask('build', [ 'clean:build', 'copy', 'uglify', 'cssmin', 'usemin', 'htmlmin', 'cachebreaker', 'clean:buildfinally' ]);
	grunt.registerTask('htmlcheck', [ 'htmlhintplus' ]);
	grunt.registerTask('jscheck', [ 'jshint' ]);

	// 検証用（webリソースの再作成のみ）2017/03/02 inoue
	// コンパイルやwar作成などを飛ばして、minify等の結果を検証したい場合に、直接コマンドプロンプトから「grunt web」で実行します。
	// 一度普通にbuildしてから、tomcatのdocBaseにdistディレクトリを指定すると、これ系の検証が捗ります。
	grunt.registerTask('web', [ 'clean:wms', 'copy:jsp', 'copy:base', 'copy:audio', 'copy:LICENSE', 'uglify', 'cssmin', 'usemin', 'htmlmin', 'cachebreaker' ]);

};
