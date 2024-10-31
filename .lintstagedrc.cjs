module.exports = {
  '*.proto': () => ['mvn proto-backwards-compatibility:backwards-compatibility-check', 'git add *proto.lock'],
};
